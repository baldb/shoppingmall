package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.Product;
import com.liny.mall.pojo.ProductImg;
import com.liny.mall.pojo.vo.ProductVO;
import com.liny.mall.service.ProductService;
import com.liny.mall.mapper.ProductMapper;
import com.liny.mall.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author linyi
* @description 针对表【product(商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表)】的数据库操作Service实现
* @createDate 2022-08-27 11:17:22
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

    @Autowired
    private ProductMapper productMapper;
    @Override
    public ResultVo listRecommendProducts() {
        //List<ProductVO> productVOList = new ArrayList<>();
        //使用多态。

        return ResultVo.ok(productMapper.listRecommendProducts());
    }
}





