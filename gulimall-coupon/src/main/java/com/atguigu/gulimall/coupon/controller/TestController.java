package com.atguigu.gulimall.coupon.controller;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.coupon.entity.CouponEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘佳俊
 */
@RestController
@RequestMapping("/test")
@RefreshScope// 设置配置中心 自动刷新
public class TestController {
    /**
     * 测试 openFeign
     *
     */
    @GetMapping("/OpenFeign")
    public R testOpenFeign(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponImg("优惠券");
        return R.ok().put("coupon",couponEntity);
    }

    /**
     * 测试 nacos的配置中心
     *
     */

    @Value("${coupon.user.name}")
    private String username;
    @Value("${coupon.user.age}")
    private String age;

    @Value("${spring.application.name}")
    private String applicationName;





    @GetMapping("/nacosConfig")
    public R testNacosConfig(){
        return R.ok().put("username",username).put("applicationName",applicationName).put("age",age);
    }

}
