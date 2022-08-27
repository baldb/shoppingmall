package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.Category;
import com.liny.mall.service.CategoryService;
import com.liny.mall.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【category(商品分类)】的数据库操作Service实现
* @createDate 2022-08-27 11:17:21
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




