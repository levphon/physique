package com.hflw.physique.service;

import com.hflw.physique.domain.User;
import com.hflw.physique.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper mapper;


    int insert(User record) {
        return mapper.insert(record);
    }

    User selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    int updateByPrimaryKey(User record) {
        return mapper.updateByPrimaryKey(record);
    }

    int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

}
