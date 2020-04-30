package com.shu.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.shu.crm.mappers.ProductMapper;
import com.shu.crm.entity.Product;
import com.shu.crm.service.ProductService;
import org.springframework.stereotype.Service;


/**
 * 产品Service实现类
 * @author Administrator
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductMapper productDao;

	@Override
	public List<Product> find(Map<String, Object> map) {
		return productDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return productDao.getTotal(map);
	}

}
