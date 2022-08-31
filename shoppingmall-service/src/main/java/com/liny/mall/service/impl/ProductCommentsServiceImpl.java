package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.ProductComments;
import com.liny.mall.service.ProductCommentsService;
import com.liny.mall.mapper.ProductCommentsMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【product_comments(商品评价 )】的数据库操作Service实现
* @createDate 2022-08-27 11:17:22
*/
@Service
public class ProductCommentsServiceImpl extends ServiceImpl<ProductCommentsMapper, ProductComments>
    implements ProductCommentsService{

}




