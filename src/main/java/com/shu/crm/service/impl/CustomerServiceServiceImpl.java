package com.shu.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.shu.crm.mappers.CustomerServiceMapper;
import com.shu.crm.entity.CustomerService;
import com.shu.crm.service.CustomerServiceService;
import org.springframework.stereotype.Service;
;

/**
 * 客服服务Service实现类
 * @author Administrator
 *
 */
@Service("customerServiceService")
public class CustomerServiceServiceImpl implements CustomerServiceService {

	@Resource
	private CustomerServiceMapper customerServiceDao;

	@Override
	public int add(CustomerService customerService) {
		return customerServiceDao.add(customerService);
	}

	@Override
	public List<CustomerService> find(Map<String, Object> map) {
		return customerServiceDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerServiceDao.getTotal(map);
	}

	@Override
	public int update(CustomerService customerService) {
		return customerServiceDao.update(customerService);
	}



}
