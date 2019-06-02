package com.hflw.physique.mapper;

import com.hflw.physique.common.mapper.CommonMapper;
import com.hflw.physique.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends CommonMapper<User> {
}