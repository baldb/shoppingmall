package com.liny.mall.mapper;

import com.liny.mall.pojo.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liny.mall.pojo.vo.CategoryVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author linyi
* @description 针对表【category(商品分类)】的数据库操作Mapper
* @createDate 2022-08-27 11:17:21
* @Entity com.liny.mall.pojo.Category
*/
@Repository
public interface CategoryMapper extends BaseMapper<Category> {

    //1.连接查询
    public List<CategoryVO> selectAllCategories();

}




