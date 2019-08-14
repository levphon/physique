package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Setter
@Getter
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