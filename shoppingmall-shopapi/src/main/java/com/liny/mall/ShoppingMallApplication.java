package com.liny.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author linyi
 * @date 2022/8/26
 * 1.0
 */

@SpringBootApplication
@MapperScan("com.liny.mall.mapper")
public class ShoppingMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallApplication.class,args);
    }
}
