package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.ProductSku;
import com.liny.mall.service.ProductSkuService;
import com.liny.mall.mapper.ProductSkuMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【product_sku(商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计)】的数据库操作Service实现
* @createDate 2022-08-27 11:17:22
*/
@Service
public class ProductSkuServiceImpl extends ServiceImpl<ProductSkuMapper, ProductSku>
    implements ProductSkuService{

}




