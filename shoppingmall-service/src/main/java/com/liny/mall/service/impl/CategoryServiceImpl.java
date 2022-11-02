package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.Category;
import com.liny.mall.pojo.vo.CategoryVO;
import com.liny.mall.service.CategoryService;
import com.liny.mall.mapper.CategoryMapper;
import com.liny.mall.vo.ResultCodeEnum;
import com.liny.mall.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author linyi
* @description 针对表【category(商品分类)】的数据库操作Service实现
* @createDate 2022-08-27 11:17:21
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public ResultVo listCategories() {
        List<CategoryVO> categoryVOS = categoryMapper.selectAllCategories();
        //List<Category> categoriesList = this.lambdaQuery()
        //        .eq(Category::getParentId, 0)
        //        .list();
        //if(categoriesList.isEmpty()){
        //    return ResultVo.build(null, ResultCodeEnum.PARAMETER_NULL);
        //}
        return ResultVo.ok(categoryVOS);
    }
}




