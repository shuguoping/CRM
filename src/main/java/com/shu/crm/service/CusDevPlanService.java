package com.shu.crm.service;

import com.shu.crm.entity.CusDevPlan;

import java.util.List;
import java.util.Map;


/**
 * 客户开发计划Service接口
 * @author Administrator
 *
 */
public interface CusDevPlanService {


	/**
	 * 查询客户开发计划集合
	 * @param map
	 * @return
	 */
	public List<CusDevPlan> find(Map<String,Object> map);


	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 修改客户开发计划
	 * @param cusDevPlan
	 * @return
	 */
	public int update(CusDevPlan cusDevPlan);

	/**
	 * 添加客户开发计划
	 * @param cusDevPlan
	 * @return
	 */
	public int add(CusDevPlan cusDevPlan);

	/**
	 * 删除客户开发计划
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

}
