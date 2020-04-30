package com.shu.crm.service.impl;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shu.crm.mappers.UserMapper;
import com.shu.crm.entity.User;
import com.shu.crm.service.UserService;
import org.springframework.stereotype.Service;


/**
 * 用户Service实现类
 *
 * @author Administrator
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public User login(User user) {
        return baseMapper.selectOne(new QueryWrapper<User>().lambda()
                .eq(User::getUserName, user.getUserName())
                .eq(User::getRoleName, user.getRoleName())
                .eq(User::getPassword, user.getPassword()));
    }

    @Override
    public List<User> find(Map<String, Object> map) {
        return baseMapper.find(map);
    }

    @Override
    public Long getTotal(Map<String, Object> map) {
        return baseMapper.getTotal(map);
    }

    @Override
    public int update(User user) {
        return baseMapper.update(user);
    }

    @Override
    public int add(User user) {
        return baseMapper.add(user);
    }

    @Override
    public int delete(Integer id) {
        return baseMapper.delete(id);
    }
}
