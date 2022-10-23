package com.liny.mall.utils;

import io.jsonwebtoken.*;
import org.springframework.util.StringUtils;

import java.util.Date;

public class JwtHelper {
//    private static long tokenExpiration = 24*60*60*1000; //一天
//    private static long tokenExpiration = 60*1000*5; //5分钟
    private static long tokenExpiration = 20*1000; //10秒
    //private static final long timeMin = 1000 * 60 * 30;   //30分钟
    private static String tokenSignKey = "linySHOPPINGMALL";

    //生成token字符串
    public static String createToken(String nickName,Integer userId) {
        String token = Jwts.builder()

                //主题
                .setSubject("SHOPPING-MALL")
                //有效时间
                .setExpiration(new Date(System.currentTimeMillis() + tokenExpiration))

                //第二部分：paylod  载客
                .claim("nickName", nickName)
//                .claim("userName", userName)
                .claim("userId", userId)

                //第三部分：signature  SignatureAlgorithm.HS256加密算法
                .signWith(SignatureAlgorithm.HS512, tokenSignKey)
                .compressWith(CompressionCodecs.GZIP)
                //拼接
                .compact();
        return token;
    }

    //从token字符串获取userid
    public static Integer getUserId(String token) {
        if(StringUtils.isEmpty(token)) return null;
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        Integer userId = (Integer)claims.get("userId");
        //return userId.longValue();
        return userId;
    }

    //从token字符串获取nickName
    public static String getNickName(String token) {
        if(StringUtils.isEmpty(token)) return null;
        Jws<Claims> claimsJws
                = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        return (String)(claims.get("nickName"));
    }

    //从token字符串获取userName
    public static String getUserName(String token) {
        if(StringUtils.isEmpty(token)) return "";
        Jws<Claims> claimsJws
                = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        return (String)claims.get("userName");
    }

    //判断token是否有效
    public static boolean isExpiration(String token){
        try {
            boolean isExpire = Jwts.parser()
                    .setSigningKey(tokenSignKey)
                    .parseClaimsJws(token)
                    .getBody()
                    .getExpiration().before(new Date());
            //没有过期，有效，返回false
            return isExpire;
        }catch(Exception e) {
            //过期出现异常，返回true
            return true;
        }
    }


    /**
     * 刷新Token
     * @param token
     * @return
     */
    public String refreshToken(String token) {
        String refreshedToken;
        try {
            final Claims claims = Jwts.parser()
                    .setSigningKey(tokenSignKey)
                    .parseClaimsJws(token)
                    .getBody();
            refreshedToken = JwtHelper.createToken(getNickName(token),getUserId(token));
        } catch (Exception e) {
            refreshedToken = null;
        }
        return refreshedToken;
    }

}