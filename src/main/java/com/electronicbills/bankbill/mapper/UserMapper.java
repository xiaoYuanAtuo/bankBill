package com.electronicbills.bankbill.mapper;

import com.electronicbills.bankbill.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zht on 2018/12/17
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user(username,password)values(#{username},#{password}")
    public int add(User user);
}
