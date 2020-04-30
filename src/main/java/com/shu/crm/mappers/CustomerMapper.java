package com.shu.crm.mappers;

import com.shu.crm.entity.Customer;
import com.shu.crm.entity.CustomerFw;
import com.shu.crm.entity.CustomerGc;
import com.shu.crm.entity.CustomerGx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
;

/**
 * 客户Dao接口
 * @author Administrator
 *
 */
@Mapper
public interface CustomerMapper {


	/**
	 * 查询客户集合
	 * @param map
	 * @return
	 */
	public List<Customer> find(Map<String,Object> map);

	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 添加客户
	 * @param customer
	 * @return
	 */
	public int add(Customer customer);

	/**
	 * 修改客户
	 * @param customer
	 * @return
	 */
	public int update(Customer customer);

	/**
	 * 删除客户
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

	/**
	 * 通过Id查找实体
	 * @param id
	 * @return
	 */
	public Customer findById(Integer id);

	/**
	 * 查找流失的客户 6个月未下单的客户
	 * @return
	 */
	public List<Customer> findLossCustomer();

	/**
	 * 查询客户贡献
	 * @param map
	 * @return
	 */
	public List<CustomerGx> findCustomerGx(Map<String,Object> map);

	/**
	 * 查询客户贡献记录数
	 * @param map
	 * @return
	 */
	public Long getTotalCustomerGx(Map<String,Object> map);

	/**
	 * 查询客户构成
	 * @return
	 */
	public List<CustomerGc> findCustomerGc();

	/**
	 * 查询客户服务分析
	 * @return
	 */
	public List<CustomerFw> findCustomerFw();

}
