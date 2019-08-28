package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
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

}