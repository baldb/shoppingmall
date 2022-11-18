package com.liny.mall.mapper;

import com.liny.mall.pojo.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liny.mall.pojo.vo.ProductVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author linyi
* @description 针对表【product(商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表)】的数据库操作Mapper
* @createDate 2022-08-27 11:17:22
* @Entity com.liny.mall.pojo.Product
*/
@Repository
public interface ProductMapper extends BaseMapper<Product> {
    List<ProductVO> listRecommendProducts();
}




