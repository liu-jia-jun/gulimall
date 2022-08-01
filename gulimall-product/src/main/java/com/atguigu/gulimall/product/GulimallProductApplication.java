package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合 MyBatis-Plus
 *      1). 导入依赖
 *           <dependency>
 *               <groupId>com.baomidou</groupId>
 *               <artifactId>mybatis-plus-boot-starter</artifactId>
 *               <version>3.2.0</version>
 *          </dependency>
 *      2). 配置
 *          1 配置数据圆: 导入数据库驱动 设置在 application.yml文件中配置信息
 */

@SpringBootApplication
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
