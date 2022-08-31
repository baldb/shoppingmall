package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.UserAddr;
import com.liny.mall.service.UserAddrService;
import com.liny.mall.mapper.UserAddrMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【user_addr(用户地址 )】的数据库操作Service实现
* @createDate 2022-08-27 11:17:22
*/
@Service
public class UserAddrServiceImpl extends ServiceImpl<UserAddrMapper, UserAddr>
    implements UserAddrService{

}




