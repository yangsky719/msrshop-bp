package com.msr.msrshop.order.dao;

import com.msr.msrshop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-10 14:41:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
