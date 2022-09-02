


package com.liny.mall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liny.mall.pojo.Users;
import com.liny.mall.vo.ResultVo;

import java.util.List;

/**
 * @author linyi
 * @date 2022/8/31
 * 1.0
 */
public interface UsersService extends IService<Users> {

    Page getPage() ;

    //用户注册
    ResultVo userResgit(String name ,String pwd);

    //⽤户登录
    public ResultVo checkLogin(String name, String pwd);
}
