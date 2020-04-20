package com.shu.crm.dao;

import com.shu.crm.entity.SaleChance;

import java.util.List;
import java.util.Map;


/**
 * 销售机会Dao接口
 * @author Administrator
 *
 */
public interface SaleChanceDao {


	/**
	 * 查询销售机会集合
	 * @param map
	 * @return
	 */
	public List<SaleChance> find(Map<String,Object> map);

	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 添加销售机会
	 * @param saleChance
	 * @return
	 */
	public int add(SaleChance saleChance);

	/**
	 * 修改销售机会
	 * @param saleChance
	 * @return
	 */
	public int update(SaleChance saleChance);

	/**
	 * 删除销售机会
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

	/**
	 * 根据id查找实体
	 * @param id
	 * @return
	 */
	public SaleChance findById(Integer id);
}

