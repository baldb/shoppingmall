package com.liny.mall.mapper;

import com.liny.mall.pojo.ProductSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author linyi
* @description 针对表【product_sku(商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计)】的数据库操作Mapper
* @createDate 2022-08-27 11:17:22
* @Entity com.liny.mall.pojo.ProductSku
*/
public interface ProductSkuMapper extends BaseMapper<ProductSku> {

}




