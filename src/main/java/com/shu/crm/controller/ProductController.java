package com.shu.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.shu.crm.entity.PageBean;
import com.shu.crm.entity.Product;
import com.shu.crm.service.ProductService;
import com.shu.crm.utils.ResponseUtil;
import com.shu.crm.utils.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 产品Controller层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/product")
public class ProductController {

	@Resource
	private ProductService productService;


	/**
	 * 分页条件查询产品
	 * @param page
	 * @param rows
	 * @param s_product
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,Product s_product,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("productName", StringUtil.formatLike(s_product.getProductName()));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Product> productList=productService.find(map);
		Long total=productService.getTotal(map);
		JSONObject result=new JSONObject();
		JSONArray jsonArray=JSONArray.fromObject(productList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
}
