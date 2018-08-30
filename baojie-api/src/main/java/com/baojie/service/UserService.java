package com.baojie.service;

import com.baojie.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author baojie
 * @since 2018-08-30
 */
public interface UserService extends IService<User> {
    /**
     * 用于shiro获取用户角色
     *
     * @param userId
     * @return
     * @throws Exception
     */
    Set<String> getRoleListByUserId(Integer userId) throws Exception;

    /**
     * 用于shiro获取权限
     *
     * @param userId
     * @return
     * @throws Exception
     */
    Set<String> getPermissionListByUserId(Integer userId) throws Exception;
}
