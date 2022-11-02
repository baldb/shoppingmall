package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.pojo.IndexImg;
import com.liny.mall.service.IndexImgService;
import com.liny.mall.mapper.IndexImgMapper;
import com.liny.mall.vo.ResultCodeEnum;
import com.liny.mall.vo.ResultVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author linyi
* @description 针对表【index_img(轮播图 )】的数据库操作Service实现
* @createDate 2022-08-27 11:17:21
*/
@Service
public class IndexImgServiceImpl extends ServiceImpl<IndexImgMapper, IndexImg>
    implements IndexImgService{

    @Override
    public ResultVo listIndexImg() {
        List<IndexImg> indexImgList = this.lambdaQuery()
                .eq(IndexImg::getStatus, 1)
                .orderByAsc(IndexImg::getSeq)
                .list();
        if(indexImgList.isEmpty()){
            return ResultVo.build(null, ResultCodeEnum.PARAMETER_NULL);
        }
        return ResultVo.ok(indexImgList);
    }
}




