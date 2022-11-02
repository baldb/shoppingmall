package com.liny.mall.service;

import com.liny.mall.pojo.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liny.mall.vo.ResultVo;

/**
* @author linyi
* @description 针对表【category(商品分类)】的数据库操作Service
* @createDate 2022-08-27 11:17:21
*/
public interface CategoryService extends IService<Category> {

    //查询分类信息列表
    ResultVo listCategories();
}
