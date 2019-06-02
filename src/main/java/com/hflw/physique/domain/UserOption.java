package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "pts_user_option")
public class UserOption extends BaseEntity {

    /**
     * 问题id
     */
    @Column(name = "question_id")
    private Integer questionId;

    /**
     * 回答项,可能多选,多个id逗号分隔
     */
    @Column(name = "option_ids")
    private String optionIds;

    /**
     * 分值
     */
    private Integer score;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取回答项,可能多选,多个id逗号分隔
     *
     * @return option_ids - 回答项,可能多选,多个id逗号分隔
     */
    public String getOptionIds() {
        return optionIds;
    }

    /**
     * 设置回答项,可能多选,多个id逗号分隔
     *
     * @param optionIds 回答项,可能多选,多个id逗号分隔
     */
    public void setOptionIds(String optionIds) {
        this.optionIds = optionIds;
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

}