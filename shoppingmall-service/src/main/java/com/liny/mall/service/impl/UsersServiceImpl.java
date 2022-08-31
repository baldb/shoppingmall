package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.mapper.UsersMapper;
import com.liny.mall.pojo.Users;
import com.liny.mall.service.UsersService;
import org.springframework.stereotype.Service;

/**
 * @author linyi
 * @date 2022/8/31
 * 1.0
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
        implements UsersService {

}
