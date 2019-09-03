package com.hflw.physique.biz.controller;

import com.hflw.physique.framework.controller.BaseController;
import com.hflw.physique.framework.core.web.PureR;
import com.hflw.physique.biz.domain.QuestionOption;
import com.hflw.physique.biz.service.QuestionOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questionoption")
public class QuestionOptionController extends BaseController {

    @Autowired
    private QuestionOptionService questionOptionService;

    @GetMapping("/listByQuestionId")
    public PureR listByQuestionId(Integer questionId) {
        List<QuestionOption> list = questionOptionService.listByQuestionId(questionId);
        return PureR.success(list);
    }

}
