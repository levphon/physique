package com.hflw.physique.biz.mapper;

import com.hflw.physique.framework.mapper.CommonMapper;
import com.hflw.physique.biz.domain.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface QuestionMapper extends CommonMapper<Question> {

    List<Question> search(Map<String, Object> params);

}