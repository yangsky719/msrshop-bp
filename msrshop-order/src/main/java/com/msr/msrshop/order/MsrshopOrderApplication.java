package com.msr.msrshop.order;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.msr.msrshop.order.dao")
@SpringBootApplication
public class MsrshopOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsrshopOrderApplication.class, args);
	}

}
