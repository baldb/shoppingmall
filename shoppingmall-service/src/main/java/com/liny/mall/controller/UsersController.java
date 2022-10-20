package com.liny.mall.controller;

import com.liny.mall.pojo.Users;
import com.liny.mall.service.UsersService;
import com.liny.mall.vo.ResultVo;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author linyi
 * @date 2022/9/2
 * 1.0
 */

@RestController
@Slf4j
@Api(tags = "用户模块", value = "提供用户注册和登陆接口")
@RequestMapping("/user")
@CrossOrigin //允许跨域请求
public class UsersController {
    @Resource
    private UsersService usersService;

    @GetMapping("/login")
    @ApiOperation("⽤户登录接⼝")
    public ResultVo login(@ApiParam(value = "用户登陆账号") @RequestParam String username,
                          @ApiParam(value = "用户登陆密码") @RequestParam String password) {
        log.info("⽤户登录=======》"+this.getClass());
        return usersService.checkLogin(username,password);
    }

    @PostMapping("/regist")
    @ApiOperation("⽤户注册接⼝")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string",name = "username", value = "用户注册账号",required = true),
            @ApiImplicitParam(dataType = "string",name = "password", value = "用户注册密码",required = true)
    })
    public ResultVo regist(@RequestBody Users user){
        log.info("⽤户注册接口 =======》"+this.getClass());
        ResultVo resultVO = usersService.userResgit(user.getUsername(), user.getPassword());
        return resultVO;
    }
}
