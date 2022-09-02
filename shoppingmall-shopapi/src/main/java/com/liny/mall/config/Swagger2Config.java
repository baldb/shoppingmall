package com.liny.mall.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 * @author linyi
 * @date 2022/8/31
 * 1.0
 */
@Configuration
@EnableKnife4j
public class Swagger2Config {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        String groupName="3.X版本";
        Docket docket=new Docket(DocumentationType.OAS_30)
                .apiInfo(new ApiInfoBuilder()
                        .title("《锋迷商城》 ")
                        .description("此⽂档详细说明了锋迷商城项⽬后端接⼝规范....")
                        .termsOfServiceUrl("http://127.0.0.0:8090/")
                        .contact(new Contact("林逸","https://github.com/baldb","1111111@qq.com"))
                        .version("2.0.1")
                        .build())
                //分组名称
                .groupName(groupName)
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.liny.mall.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
