package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Setter
@Getter
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