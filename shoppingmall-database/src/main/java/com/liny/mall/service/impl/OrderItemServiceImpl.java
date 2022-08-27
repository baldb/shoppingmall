package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.OrderItem;
import com.liny.mall.service.OrderItemService;
import com.liny.mall.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【order_item(订单项/快照 )】的数据库操作Service实现
* @createDate 2022-08-27 11:17:21
*/
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem>
    implements OrderItemService{

}




