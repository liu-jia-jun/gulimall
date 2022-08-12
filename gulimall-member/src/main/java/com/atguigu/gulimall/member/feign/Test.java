package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 刘佳俊
 */
@FeignClient("gulimall-coupon")
public interface Test {
    @GetMapping("/coupon/coupon/test")
    public R test();
}
