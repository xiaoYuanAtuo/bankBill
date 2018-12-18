package com.electronicbills.bankbill.controller;

import com.electronicbills.bankbill.pojo.User;
import com.electronicbills.bankbill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zht on 2018/12/17
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findAll")
    public String findAll(HttpServletRequest request) {

        System.out.println("PageController:page()");

        List<User> list = userService.findAll();


        request.setAttribute("userlist", list);

        return "listall";


    }
}
