package com.liny.mall.config.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author linyi
 * @date 2022/10/24
 * 1.0
 * 配置token拦截的请求路径
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private CheckTokenInterceptor checkTokenInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(checkTokenInterceptor)
                .addPathPatterns("/shopcart/**")//拦截请求
                .addPathPatterns("/orders/**") //拦截请求
                .excludePathPatterns("/user/**","/doc.html","/swagger-resources/**","/v3/**"); //除了/user/下的请求可以直接放行
    }
}
