package com.hflw.physique.biz.domain;

import com.hflw.physique.framework.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "pts_question_option")
public class QuestionOption extends BaseEntity {

    /**
     * 问题id
     */
    @Column(name = "question_id")
    private Integer questionId;

    /**
     * 回答项
     */
    private String option;

    /**
     * 分值
     */
    private Integer score;

    /**
     * 备注
     */
    private String remark;

    /**
     * 排序
     */
    private Integer sort;

}