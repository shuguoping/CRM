package com.shu.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.shu.crm.entity.OrderDetails;
import com.shu.crm.entity.PageBean;
import com.shu.crm.service.OrderDetailsService;
import com.shu.crm.utils.ResponseUtil;
import com.shu.crm.utils.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 订单明细Controller层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/orderDetails")
public class OrderDetailsController {

	@Resource
	private OrderDetailsService orderDetailsService;


	/**
	 * 分页条件查询订单明细
	 * @param page
	 * @param rows
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,@RequestParam(value="orderId",required=false)String orderId,HttpServletResponse response)throws Exception{
		if(StringUtil.isEmpty(orderId)){
			return null;
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("orderId", orderId);
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<OrderDetails> orderDetailsList=orderDetailsService.find(map);
		Long total=orderDetailsService.getTotal(map);
		JSONObject result=new JSONObject();
		JSONArray jsonArray=JSONArray.fromObject(orderDetailsList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}

	/**
	 * 通过订单id获取订单总金额
	 * @param orderId
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getTotalPrice")
	public String getTotalPrice(String orderId,HttpServletResponse response)throws Exception{
		float totalMoney=orderDetailsService.getTotalPriceByOrderId(Integer.parseInt(orderId));
		JSONObject result=new JSONObject();
		result.put("totalMoney", totalMoney);
		ResponseUtil.write(response, result);
		return null;
	}

}
