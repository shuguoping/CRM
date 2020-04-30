package com.shu.crm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shu.crm.entity.Contact;
import com.shu.crm.mappers.ContactMapper;
import com.shu.crm.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * 交往记录Service实现类
 *
 * @author Administrator
 */
@Service
public class ContactServiceImpl extends ServiceImpl<ContactMapper, Contact> implements ContactService {

    @Override
    public List<Contact> find(Map<String, Object> map) {
        return baseMapper.find(map);
    }

    @Override
    public Long getTotal(Map<String, Object> map) {
        return baseMapper.getTotal(map);
    }

    @Override
    public int update(Contact contact) {
        return baseMapper.update(contact);
    }

    @Override
    public int add(Contact contact) {
        return baseMapper.add(contact);
    }

    @Override
    public int delete(Integer id) {
        return baseMapper.delete(id);
    }

}
