package com.yystudy.shirostu.service.impl;

import com.yystudy.shirostu.entity.Permissions;
import com.yystudy.shirostu.entity.Role;
import com.yystudy.shirostu.entity.User;
import com.yystudy.shirostu.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author:Yangying
 * @date:2020-10-21
 */
@Service
@Slf4j
@Component
public class LoginServiceImpl implements LoginService {
    /**
     * 通过用户名 获取用户信息
     *
     * @param name 用户名
     * @return 用户信息
     */
    @Override
    public User getUserByName(String name) {
        return getMapByName(name);
    }
    /**
     * 模拟数据库查询
     *
     * @param userName 用户名
     * @return User
     */
    private User getMapByName(String userName) {
        Permissions permissions1 = new Permissions("1", "query");
        Permissions permissions2 = new Permissions("2", "add");
        Set<Permissions> permissionsSet = new HashSet<>();
        permissionsSet.add(permissions1);
        permissionsSet.add(permissions2);
        Role role = new Role("1", "admin", permissionsSet);
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(role);
        User user = new User("1", "wsl", "123456", roleSet);
        Map<String, User> map = new HashMap<>();
        map.put(user.getUserName(), user);

        Set<Permissions> permissionsSet1 = new HashSet<>();
        permissionsSet1.add(permissions1);
        Role role1 = new Role("2", "user", permissionsSet1);
        Set<Role> roleSet1 = new HashSet<>();
        roleSet1.add(role1);
        User user1 = new User("2", "zhangsan", "123456", roleSet1);
        map.put(user1.getUserName(), user1);
        return map.get(userName);
    }
}
