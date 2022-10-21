package com.liny.mall.utils;


import javax.servlet.http.HttpServletRequest;

/**
 * 在JWT封装的基础上进行再封装
 */
public class AuthContextHolder {

    //从请求头token获取userid
    public static Integer getUserIdToken(HttpServletRequest request) {
        //从请求头token
        String token = request.getHeader("token");
        //调用工具类
        Integer userId = JwtHelper.getUserId(token);
        return userId;
    }

    //从请求头token获取name
    public static String getUserName(HttpServletRequest request) {
        //从header获取token
        String token = request.getHeader("token");
        //jwt从token获取username
        String userName = JwtHelper.getUserName(token);
        return userName;
    }
}