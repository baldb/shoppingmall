package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.Orders;
import com.liny.mall.service.OrdersService;
import com.liny.mall.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【orders(订单 )】的数据库操作Service实现
* @createDate 2022-08-27 11:17:22
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}




