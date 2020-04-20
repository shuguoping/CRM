package com.shu.crm.dao;

import com.shu.crm.entity.DataDic;

import java.util.List;
import java.util.Map;


/**
 * 数据字典Dao接口
 * @author Administrator
 *
 */
public interface DataDicDao {


	/**
	 * 查询数据字典集合
	 * @param map
	 * @return
	 */
	public List<DataDic> find(Map<String,Object> map);

	/**
	 * 查询所有的数据字典名称集合
	 * @return
	 */
	public List<DataDic> findAll();

	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 修改数据字典
	 * @param dataDic
	 * @return
	 */
	public int update(DataDic dataDic);

	/**
	 * 添加数据字典
	 * @param dataDic
	 * @return
	 */
	public int add(DataDic dataDic);

	/**
	 * 删除数据字典
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

}
