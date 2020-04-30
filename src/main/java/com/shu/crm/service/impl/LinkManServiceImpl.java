package com.shu.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.shu.crm.mappers.LinkManMapper;
import com.shu.crm.entity.LinkMan;
import com.shu.crm.service.LinkManService;
import org.springframework.stereotype.Service;


/**
 * 联系人Service实现类
 * @author Administrator
 *
 */
@Service("linkManService")
public class LinkManServiceImpl implements LinkManService {

	@Resource
	private LinkManMapper linkManDao;

	@Override
	public List<LinkMan> find(Map<String, Object> map) {
		return linkManDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return linkManDao.getTotal(map);
	}

	@Override
	public int update(LinkMan linkMan) {
		return linkManDao.update(linkMan);
	}

	@Override
	public int add(LinkMan linkMan) {
		return linkManDao.add(linkMan);
	}

	@Override
	public int delete(Integer id) {
		return linkManDao.delete(id);
	}

}
