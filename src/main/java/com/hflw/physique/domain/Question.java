package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;

@Setter
@Getter
@Table(name = "pts_question")
public class Question extends BaseEntity {

    /**
     * 问题
     */
    private String question;

    /**
     * 备注
     */
    private String remark;

    /**
     * 排序
     */
    private Integer sort;

}