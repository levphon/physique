package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

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

    /**
     * 获取问题id
     *
     * @return question_id - 问题id
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置问题id
     *
     * @param questionId 问题id
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取回答项
     *
     * @return option - 回答项
     */
    public String getOption() {
        return option;
    }

    /**
     * 设置回答项
     *
     * @param option 回答项
     */
    public void setOption(String option) {
        this.option = option;
    }

    /**
     * 获取分值
     *
     * @return score - 分值
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置分值
     *
     * @param score 分值
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }


}