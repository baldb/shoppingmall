package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.UserLoginHistory;
import com.liny.mall.service.UserLoginHistoryService;
import com.liny.mall.mapper.UserLoginHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【user_login_history(登录历史表 )】的数据库操作Service实现
* @createDate 2022-08-27 11:17:22
*/
@Service
public class UserLoginHistoryServiceImpl extends ServiceImpl<UserLoginHistoryMapper, UserLoginHistory>
    implements UserLoginHistoryService{

}




