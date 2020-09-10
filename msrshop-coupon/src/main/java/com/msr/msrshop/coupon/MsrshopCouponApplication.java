package com.msr.msrshop.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.msr.msrshop.coupon.dao")
@SpringBootApplication
public class MsrshopCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsrshopCouponApplication.class, args);
	}

}
