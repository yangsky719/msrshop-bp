package com.msr.msrshop.member.dao;

import com.msr.msrshop.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-10 14:31:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
