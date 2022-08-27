package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.Users;
import com.liny.mall.service.UsersService;
import com.liny.mall.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【users(用户 )】的数据库操作Service实现
* @createDate 2022-08-27 11:17:22
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




