package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.ProductParams;
import com.liny.mall.service.ProductParamsService;
import com.liny.mall.mapper.ProductParamsMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【product_params(商品参数 )】的数据库操作Service实现
* @createDate 2022-08-27 11:17:22
*/
@Service
public class ProductParamsServiceImpl extends ServiceImpl<ProductParamsMapper, ProductParams>
    implements ProductParamsService{

}




