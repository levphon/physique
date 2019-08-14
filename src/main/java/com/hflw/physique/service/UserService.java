package com.hflw.physique.service;

import com.hflw.physique.domain.User;
import com.hflw.physique.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper mapper;

    int save(User record) {
        return mapper.insert(record);
    }

    User getById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    int update(User record) {
        return mapper.updateByPrimaryKey(record);
    }

    int deleteById(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

}
