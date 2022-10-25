package com.liny.mall.config;

/**
 * @author linyi
 * @date 2022/7/29
 * 1.0
 * 自定义异常返回消息
 */

public class CommonException extends RuntimeException{
    //定义一个有参构造器，用于向上抛自定义异常信息
    public CommonException(String message){
        super(message);
    }
}
