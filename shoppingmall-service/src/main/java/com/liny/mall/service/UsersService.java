


package com.liny.mall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liny.mall.pojo.Users;

import java.util.List;

/**
 * @author linyi
 * @date 2022/8/31
 * 1.0
 */
public interface UsersService extends IService<Users> {

    Page getPage() ;
}
