package com.liny.mall.controller;

import com.liny.mall.service.ShoppingCartService;
import com.liny.mall.utils.JwtHelper;
import com.liny.mall.vo.ResultCodeEnum;
import com.liny.mall.vo.ResultVo;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linyi
 * @date 2022/10/20
 * 1.0
 */
@Slf4j
@RestController
@CrossOrigin //允许跨域请求
@Api(tags = "购车模块", value = "提供购物车的一系列需求接口")
@RequestMapping("/shopcart")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/list")
    @ApiOperation("获取购物车列表接⼝")
    public ResultVo listShoppingCartsByUserI( @ApiParam(value = "userId") String userId){
        log.info("购物车列表接口=======》"+this.getClass());
        return ResultVo.ok().message("id:"+userId);
    }

}
