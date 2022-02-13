package com.kunpeng.mall.member.dao;

import com.kunpeng.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:27:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
