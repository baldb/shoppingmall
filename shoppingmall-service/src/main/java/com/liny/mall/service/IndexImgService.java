package com.liny.mall.service;

import com.liny.mall.pojo.IndexImg;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liny.mall.vo.ResultVo;

/**
* @author linyi
* @description 针对表【index_img(轮播图 )】的数据库操作Service
* @createDate 2022-08-27 11:17:21
*/
public interface IndexImgService extends IService<IndexImg> {

    //查询轮播图信息,查询status的值为1，且按照sql字段进行排序
    ResultVo listIndexImg();

}
