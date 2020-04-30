package com.shu.crm.mappers;

import com.shu.crm.entity.LinkMan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


/**
 * 联系人Dao接口
 * @author Administrator
 *
 */
@Mapper
public interface LinkManMapper {


	/**
	 * 查询联系人集合
	 * @param map
	 * @return
	 */
	public List<LinkMan> find(Map<String,Object> map);


	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 修改联系人
	 * @param linkMan
	 * @return
	 */
	public int update(LinkMan linkMan);

	/**
	 * 添加联系人
	 * @param linkMan
	 * @return
	 */
	public int add(LinkMan linkMan);

	/**
	 * 删除联系人
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

}
