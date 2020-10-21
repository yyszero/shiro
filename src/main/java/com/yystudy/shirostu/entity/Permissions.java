package com.yystudy.shirostu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 权限实体类
 * @author:Yangying
 * @date:2020-10-21
 */
@Data
@AllArgsConstructor
public class Permissions {
    private String id;
    private String permissionsName;
}
