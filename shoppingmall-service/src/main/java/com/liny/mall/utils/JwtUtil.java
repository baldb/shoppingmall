package com.liny.mall.utils;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.UUID;

/**
 * @author linyi
 * @date 2022/10/20
 * 1.0
 */
public class JwtUtil {

    //定义一个有效期
    private long timeDay = 1000 * 60 * 60 * 24;   //一天
    private static final long timeMin = 1000 * 60 * 30;   //30分钟
    private static final String signature = "shoppingmall";

    public static String getToken(String username, String id) {
        JwtBuilder jwtBuilder = Jwts.builder(); //用来构建Jwt对象的
        String jwtToken = jwtBuilder
                //第一部分：head头信息
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                // 第二部分：paylod  载客
                .claim("username", username)
                .claim("role", id)
                //主题
                .setSubject("StuManage_test")
                //有效时间
                .setExpiration(new Date(System.currentTimeMillis() + timeMin))
                .setId(UUID.randomUUID().toString())
                //第三部分：signature  SignatureAlgorithm.HS256加密算法
                .signWith(SignatureAlgorithm.HS256, signature)
                //拼接
                .compact();
        return jwtToken;
    }
}

