package com.liny.mall.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liny.mall.pojo.Product;
import com.liny.mall.pojo.UserAddr;
import com.liny.mall.pojo.Users;
import com.liny.mall.service.ProductService;
import com.liny.mall.service.UserAddrService;
import com.liny.mall.service.UsersService;
import com.liny.mall.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "测试接口")
public class TestController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UserAddrService userAddrService;

    @Autowired
    private ProductService productService;

    @GetMapping("/test")
    @ApiOperation("获取用户接口")
    public ResultVo<List<Users>>  helo(){
        final List<Users> list = usersService.list();
        return ResultVo.ok(list);
    }

    @GetMapping("/test02")
    @ApiOperation("获取用户地址接口")
    public ResultVo helo2(){
        final List<UserAddr> list = userAddrService.list();
        return ResultVo.ok(list);
    }

    @GetMapping("/test03")
    @ApiOperation("获取product地址接口")
    public ResultVo helo3(){
        final List<Product> list = productService.list();

        return ResultVo.ok(list);
    }

    @GetMapping("/test04")
    @ApiOperation("获取分页数据")
    public ResultVo<Page> helo4(){
        Page page = usersService.getPage();
        return ResultVo.ok(page);
    }
}
