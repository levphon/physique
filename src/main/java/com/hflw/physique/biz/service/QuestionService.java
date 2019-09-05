package com.hflw.physique.biz.service;

import com.hflw.physique.biz.domain.Question;
import com.hflw.physique.biz.mapper.QuestionMapper;
import com.hflw.physique.biz.mapper.QuestionOptionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class QuestionService {

    @Resource
    private QuestionMapper mapper;

    @Resource
    private QuestionOptionMapper questionOptionMapper;

    public List<Question> search(Map<String, Object> params) {
        List<Question> questionList = mapper.search(params);
        setOptions(questionList);
        return questionList;
    }

    public List<Question> list() {
        List<Question> questionList = mapper.selectAll();
        setOptions(questionList);
        return questionList;
    }

    private void setOptions(List<Question> questionList) {
        for (Question question : questionList) {
            question.setOptions(questionOptionMapper.listByQuestionId(question.getId()));
        }
    }

}
