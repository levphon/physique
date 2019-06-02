package com.hflw.physique.mapper;

import com.hflw.physique.common.mapper.CommonMapper;
import com.hflw.physique.domain.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface QuestionMapper extends CommonMapper<Question> {

    List<Question> search(Map<String, Object> params);

}