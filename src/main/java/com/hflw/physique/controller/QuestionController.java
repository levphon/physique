package com.hflw.physique.controller;

import com.hflw.physique.common.controller.BaseController;
import com.hflw.physique.common.core.web.PageR;
import com.hflw.physique.common.core.web.PureR;
import com.hflw.physique.domain.Question;
import com.hflw.physique.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/question")
public class QuestionController extends BaseController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/search")
    public PageR search(@RequestParam Map<String, Object> params) {
        startPage();
        List<Question> list = questionService.search(params);
        return getDataTable(list);
    }

    @GetMapping("/list")
    public PureR list() {
        List<Question> list = questionService.list();
        return PureR.success(list);
    }

}
