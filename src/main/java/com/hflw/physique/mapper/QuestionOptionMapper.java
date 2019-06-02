package com.hflw.physique.mapper;

import com.hflw.physique.common.mapper.CommonMapper;
import com.hflw.physique.domain.QuestionOption;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionOptionMapper extends CommonMapper<QuestionOption> {

    List<QuestionOption> listByQuestionId(Integer questionId);

}