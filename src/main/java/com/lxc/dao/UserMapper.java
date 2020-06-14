package com.lxc.dao;

import com.lxc.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(int id);


}
