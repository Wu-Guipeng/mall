package com.kunpeng.mall.member.dao;

import com.kunpeng.mall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:27:43
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
