package com.jiangjiawei.dao;


import com.jiangjiawei.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    //按条件查找用户
    List<User> findUserByCondition(Map<String,Object> map);

    //查找所有用户
    List<User> findUserAll();

    //根据多个ID查找用户
    List<User> findUserByIds(List<String> list);

    //添加用户
    void insertUser(User user);




}
