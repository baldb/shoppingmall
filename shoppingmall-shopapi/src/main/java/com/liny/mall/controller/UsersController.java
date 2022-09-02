package com.liny.mall.controller;

import com.liny.mall.pojo.Users;
import com.liny.mall.service.UsersService;
import com.liny.mall.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author linyi
 * @date 2022/9/2
 * 1.0
 */

@RestController
@Api(tags = "用户模块", value = "提供用户注册和登陆接口")
public class UsersController {
    @Resource
    private UsersService usersService;

    @ApiOperation("⽤户登录接⼝")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "username", value = "⽤户登录账 号", required = true),
            @ApiImplicitParam(dataType = "string", name = "password", value = "⽤户登录密 码", required = true)
    })
    @GetMapping("/login")
    public ResultVo login(@RequestParam("username") String name,
                          @RequestParam(value = "password") String pwd) {
        return usersService.checkLogin(name,pwd);
    }

    @ApiOperation("⽤户注册接⼝")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "username", value = "⽤户注册账 号", required = true),
            @ApiImplicitParam(dataType = "string", name = "password", value = "⽤户注册密 码", required = true)})
    @PostMapping("/regist")
    public ResultVo regist(String username, String password) {
        return usersService.userResgit(username, password);

    }
}
