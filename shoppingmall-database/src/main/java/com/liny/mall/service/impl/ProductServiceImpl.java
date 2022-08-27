package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.Product;
import com.liny.mall.service.ProductService;
import com.liny.mall.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【product(商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表)】的数据库操作Service实现
* @createDate 2022-08-27 11:17:22
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




