package com.hflw.physique.biz.service;

import com.hflw.physique.biz.domain.Question;
import com.hflw.physique.biz.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class QuestionService {

    @Resource
    private QuestionMapper mapper;

    public List<Question> search(Map<String, Object> params) {
        return mapper.search(params);
    }

    public List<Question> list() {
        return mapper.selectAll();
    }
}
