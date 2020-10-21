package com.yystudy.shirostu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @author:Yangying
 * @date:2020-10-21
 */
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;
}
