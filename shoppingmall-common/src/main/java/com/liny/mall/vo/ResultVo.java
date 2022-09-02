package com.liny.mall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author linyi
 * @date 2022/8/26
 * 1.0
 */
@Data
@ApiModel(value = "数据反回类型")
public class ResultVo<T> {
    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private T data;

    public ResultVo(){}



    public static<T> ResultVo<T> ok(){
        return ResultVo.ok(null);
    }

    public static<T> ResultVo<T> fail(){
        return ResultVo.fail(null);
    }

    /**
     * 操作成功
     * @param data
     * @param <T>
     * @return
     */
    public static<T> ResultVo<T> ok(T data){
        ResultVo<T> result = build(data);
        return build(data, ResultCodeEnum.SUCCESS);
    }

    /**
     * 操作失败
     * @param data
     * @param <T>
     * @return
     */
    public static<T> ResultVo<T> fail(T data){
        ResultVo<T> result = build(data);
        return build(data, ResultCodeEnum.FAIL);
    }


    // 返回数据
    protected static <T> ResultVo<T> build(T data) {
        ResultVo<T> result = new ResultVo<T>();
        if (data != null)
            result.setData(data);
        return result;
    }

    public static <T> ResultVo<T> build(T body, ResultCodeEnum resultCodeEnum) {
        ResultVo<T> result = build(body);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }



    public ResultVo<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public ResultVo<T> code(Integer code){
        this.setCode(code);
        return this;
    }

    public boolean isOk() {
        if(this.getCode().intValue() == ResultCodeEnum.SUCCESS.getCode().intValue()) {
            return true;
        }
        return false;
    }
}

