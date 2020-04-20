package com.shu.crm.dao;

import com.shu.crm.entity.OrderDetails;

import java.util.List;
import java.util.Map;


/**
 * 订单明细Dao接口
 * @author Administrator
 *
 */
public interface OrderDetailsDao {


	/**
	 * 查询订单明细集合
	 * @param map
	 * @return
	 */
	public List<OrderDetails> find(Map<String,Object> map);


	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 获取指定订单的总金额
	 * @param orderId
	 * @return
	 */
	public float getTotalPriceByOrderId(Integer orderId);



}
