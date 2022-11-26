package com.liny.mall.controller;

import com.liny.mall.mapper.ProductMapper;
import com.liny.mall.pojo.Product;
import com.liny.mall.service.CategoryService;
import com.liny.mall.service.IndexImgService;
import com.liny.mall.service.ProductService;
import com.liny.mall.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linyi
 * @date 2022/10/28
 * 1.0
 * 首页轮播图展示效果
 */
@Slf4j
@RestController
@CrossOrigin //允许跨域请求
@Api(tags = "轮播图模块", value = "提供首页轮播图的一系列需求接口")
@RequestMapping("/index")
public class IndexImgController {
    @Autowired
    private IndexImgService indexImgService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @ApiOperation("根据sql字段获取排序好的轮播图列表")
    @GetMapping("/indeximg")
    public ResultVo getIndexImgList(){
        return indexImgService.listIndexImg();
    }

    @GetMapping("/category-list")
    @ApiOperation("商品分类查询接口")
    public ResultVo listCatetory(){
        return categoryService.listCategories();
    }


    @GetMapping("/list-recommends")
    @ApiOperation("新品推荐接口")
    public ResultVo listRecommendProducts() {
        return productService.listRecommendProducts();
    }

    @Autowired
    private ProductMapper productMapper;
    @GetMapping("/category-recommends")
    @ApiOperation("分类推荐接口")
    public ResultVo listRecommendProductsByCategory(){
        return categoryService.listFirstLevelCategories();
    }
}
