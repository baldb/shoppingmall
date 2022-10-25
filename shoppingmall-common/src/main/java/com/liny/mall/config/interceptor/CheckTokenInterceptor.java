package com.liny.mall.config.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liny.mall.utils.JwtHelper;
import com.liny.mall.vo.ResultCodeEnum;
import com.liny.mall.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author linyi
 * @date 2022/10/23
 * 1.0
 * 配置token拦截器
 */
@Component
@Slf4j
public class CheckTokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        log.info("请求被拦截=========>{}",request.getRequestURL());
        String token = request.getParameter("token");
        if (token == null) {
            //提示请先登录
            doResponse(response, ResultVo.build(null, ResultCodeEnum.LOGIN_AUTH).message("请先登录！"));
        } else {
            if (JwtHelper.isExpiration(token)) {
                doResponse(response, ResultVo.build(null, ResultCodeEnum.LOGIN_AUTH).message("登录过期或异常，请重新登录！"));
            }else {
                log.info("Token true,请求被放行=============>{}",request.getRequestURL());
                return true;
            }
        }
        return false;
    }


    private void doResponse(HttpServletResponse response, ResultVo resultVO) throws
            IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String s = new ObjectMapper().writeValueAsString(resultVO);
        out.print(s);
        out.flush();
        out.close();
    }
}
