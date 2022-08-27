package com.liny.mall.service;

import com.liny.mall.pojo.ProductSku;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author linyi
* @description 针对表【product_sku(商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计)】的数据库操作Service
* @createDate 2022-08-27 11:17:22
*/
public interface ProductSkuService extends IService<ProductSku> {

}
