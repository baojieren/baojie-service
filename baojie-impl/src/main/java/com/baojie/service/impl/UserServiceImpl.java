package com.baojie.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojie.entity.User;
import com.baojie.mapper.UserMapper;
import com.baojie.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author baojie
 * @since 2018-08-30
 */
@Service(
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}",
        timeout = 30000
)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Set<String> getRoleListByUserId(Integer userId) throws Exception {
        if (userId != null) {
            return userMapper.getRoleListByUserId(userId);
        }
        return null;
    }

    @Override
    public Set<String> getPermissionListByUserId(Integer userId) throws Exception {
        if (userId != null) {
            return userMapper.getPermissionListByUserId(userId);
        }
        return null;
    }
}
