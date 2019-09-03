package com.hflw.physique.biz.domain;

import com.hflw.physique.framework.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "pts_physique_pic")
public class PhysiquePic extends BaseEntity {

    /**
     * 体质id
     */
    @Column(name = "physique_id")
    private Integer physiqueId;

    /**
     * 图片链接
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 排序
     */
    private Integer sort;

}