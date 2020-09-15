package com.msr.msrshop.member.feign;


import com.msr.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("msrshop-coupon")
public interface  CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
