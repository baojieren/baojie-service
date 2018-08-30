package com.baojie.mapper;

import com.baojie.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Set;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author baojie
 * @since 2018-08-30
 */
public interface UserMapper extends BaseMapper<User> {
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
