package com.hflw.physique.biz.mapper;

import com.hflw.physique.framework.mapper.CommonMapper;
import com.hflw.physique.biz.domain.QuestionOption;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionOptionMapper extends CommonMapper<QuestionOption> {

    List<QuestionOption> listByQuestionId(Integer questionId);

}