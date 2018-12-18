package com.electronicbills.bankbill.service;

import com.electronicbills.bankbill.mapper.UserMapper;
import com.electronicbills.bankbill.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zht on 2018/12/17
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findAll();
    }
    public int add(User user){
        return userMapper.add(user);
    }
}
