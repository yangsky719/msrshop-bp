package com.msr.msrshop.order.dao;

import com.msr.msrshop.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-10 14:41:14
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
