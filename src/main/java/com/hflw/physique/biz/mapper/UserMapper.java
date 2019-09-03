package com.hflw.physique.biz.mapper;

import com.hflw.physique.framework.mapper.CommonMapper;
import com.hflw.physique.biz.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends CommonMapper<User> {
}