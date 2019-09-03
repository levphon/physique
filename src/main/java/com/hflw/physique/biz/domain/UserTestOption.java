package com.hflw.physique.biz.domain;

import com.hflw.physique.framework.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "pts_user_test_option")
public class UserTestOption extends BaseEntity {

    /**
     * 测试id
     */
    @Column(name = "test_id")
    private Integer testId;

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

}