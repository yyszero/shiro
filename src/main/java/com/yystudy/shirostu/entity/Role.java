package com.yystudy.shirostu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @TODO 角色实体类
 * @author:Yangying
 * @date:2020-10-21
 */
@Data
@AllArgsConstructor
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;
}
