package com.shu.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.shu.crm.dao.CustomerReprieveDao;
import com.shu.crm.entity.CustomerReprieve;
import com.shu.crm.service.CustomerReprieveService;
import org.springframework.stereotype.Service;


/**
 * 客户流失暂缓措施Service实现类
 *
 * @author Administrator
 */
@Service("customerReprieveService")
public class CustomerReprieveServiceImpl implements CustomerReprieveService {

	@Resource
	private CustomerReprieveDao customerReprieveDao;
    @Override
    public List<CustomerReprieve> find(Map<String, Object> map) {
        return customerReprieveDao.find(map);
    }

    @Override
    public Long getTotal(Map<String, Object> map) {
        return customerReprieveDao.getTotal(map);
    }

    @Override
    public int update(CustomerReprieve customerReprieve) {
        return customerReprieveDao.update(customerReprieve);
    }

    @Override
    public int add(CustomerReprieve customerReprieve) {
        return customerReprieveDao.add(customerReprieve);
    }

    @Override
    public int delete(Integer id) {
        return customerReprieveDao.delete(id);
    }

}
