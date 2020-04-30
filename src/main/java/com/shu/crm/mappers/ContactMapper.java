package com.shu.crm.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shu.crm.entity.Contact;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


/**
 * 交往记录Dao接口
 * @author Administrator
 *
 */
@Mapper
public interface ContactMapper extends BaseMapper<Contact> {


	/**
	 * 查询交往记录集合
	 * @param map
	 * @return
	 */
	public List<Contact> find(Map<String,Object> map);


	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 修改交往记录
	 * @param contact
	 * @return
	 */
	public int update(Contact contact);

	/**
	 * 添加交往记录
	 * @param contact
	 * @return
	 */
	public int add(Contact contact);

	/**
	 * 删除交往记录
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

}
