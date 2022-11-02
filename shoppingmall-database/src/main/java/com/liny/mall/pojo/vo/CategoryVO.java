package com.liny.mall.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author linyi
 * @date 2022/11/2
 * 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategoryVO {

    private Integer categoryId;
    private String categoryName;
    private Integer categoryLevel;
    private Integer parentId;
    private String categoryIcon;
    private String categorySlogan;
    private String categoryPic;
    private String categoryBgColor;
    //实现首页的类别显示
    private List<CategoryVO> categories;
    //实现首页分类商品推荐
    private List<ProductVO> products;

}
