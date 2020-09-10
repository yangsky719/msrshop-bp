package com.msr.msrshop.product.dao;

import com.msr.msrshop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-10 12:04:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
