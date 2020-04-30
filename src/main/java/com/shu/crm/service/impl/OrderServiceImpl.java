package com.shu.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.shu.crm.mappers.OrderMapper;
import com.shu.crm.entity.Order;
import com.shu.crm.service.OrderService;
import org.springframework.stereotype.Service;


/**
 * 订单Service实现类
 * @author Administrator
 *
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderMapper orderDao;

	@Override
	public List<Order> find(Map<String, Object> map) {
		return orderDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return orderDao.getTotal(map);
	}

	@Override
	public Order findById(Integer id) {
		return orderDao.findById(id);
	}

}
