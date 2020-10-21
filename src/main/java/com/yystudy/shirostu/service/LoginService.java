package com.yystudy.shirostu.service;

import com.yystudy.shirostu.entity.User;

/**
 * @author:Yangying
 * @date:2020-10-21
 */
public interface LoginService {
    /**
     * 通过用户名 获取用户信息
     * @param name 用户名
     * @return 用户信息
     */
    User getUserByName(String name);
}
