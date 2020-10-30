package com.lyz.dao;

import com.lyz.pojo.User;

import java.util.List;

public interface UserMapper {
    //获取全部用户
    List<User> getUserList();

    //根据ID查询永华
    User getUserById(int id);

    //增加一个用户
    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
