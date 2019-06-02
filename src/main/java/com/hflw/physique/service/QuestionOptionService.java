package com.hflw.physique.service;

import com.hflw.physique.domain.QuestionOption;
import com.hflw.physique.mapper.QuestionOptionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class QuestionOptionService {

    @Resource
    private QuestionOptionMapper mapper;

    public List<QuestionOption> search(Map<String, Object> params) {
        return null;
    }

    public List<QuestionOption> listByQuestionId(Integer questionId) {
        return mapper.listByQuestionId(questionId);
    }

}
