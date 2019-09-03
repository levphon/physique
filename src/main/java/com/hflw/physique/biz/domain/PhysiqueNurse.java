package com.hflw.physique.biz.domain;

import com.hflw.physique.framework.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "pts_physique_nurse")
public class PhysiqueNurse extends BaseEntity {

    /**
     * 体质id
     */
    @Column(name = "physique_id")
    private Integer physiqueId;

    /**
     * 方式名称
     */
    private String name;

    /**
     * 调养方式
     */
    private String content;

    /**
     * 排序
     */
    private Integer sort;

}