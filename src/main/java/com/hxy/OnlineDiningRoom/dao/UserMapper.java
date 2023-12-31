package com.hxy.OnlineDiningRoom.dao;

import com.hxy.OnlineDiningRoom.pojo.User;
import com.hxy.OnlineDiningRoom.pojo.UserExample;

import java.util.List;

public interface UserMapper extends SysDao<User>{

    List<User> selectByExample(UserExample example);

    /**
     * 停用管理员账号
     * @param name
     */
    void enableStatus(String name);

    /**
     * 开启管理员账号
     * @param name
     */
    void stopStatus(String name);
}