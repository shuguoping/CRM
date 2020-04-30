package com.shu.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.shu.crm.mappers.CusDevPlanMapper;
import com.shu.crm.entity.CusDevPlan;
import com.shu.crm.service.CusDevPlanService;
import org.springframework.stereotype.Service;

/**
 * 客户开发计划Service实现类
 * @author Administrator
 *
 */
@Service("cusDevPlanService")
public class CusDevPlanServiceImpl implements CusDevPlanService {

	@Resource
	private CusDevPlanMapper cusDevPlanMapper;

	@Override
	public List<CusDevPlan> find(Map<String, Object> map) {
		return cusDevPlanMapper.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return cusDevPlanMapper.getTotal(map);
	}

	@Override
	public int update(CusDevPlan cusDevPlan) {
		return cusDevPlanMapper.update(cusDevPlan);
	}

	@Override
	public int add(CusDevPlan cusDevPlan) {
		return cusDevPlanMapper.add(cusDevPlan);
	}

	@Override
	public int delete(Integer id) {
		return cusDevPlanMapper.delete(id);
	}

}
