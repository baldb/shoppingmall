package com.liny.mall.controller;

import com.liny.mall.pojo.Users;
import com.liny.mall.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author linyi
 * @date 2022/8/31
 * 1.0
 */
@RestController
public class TestController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/test")
    public List<Users> helo(){
        final List<Users> list = usersService.list();
        return list;
    }
}
