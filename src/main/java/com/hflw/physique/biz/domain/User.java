package com.hflw.physique.biz.domain;

import com.hflw.physique.framework.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "pts_user")
public class User extends BaseEntity {

    /**
     * 手机号
     */
    private String phone;

    /**
     * 微信公众号openid
     */
    @Column(name = "wx_openid")
    private String wxOpenid;

    /**
     * 小程序openid
     */
    @Column(name = "mini_openid")
    private String miniOpenid;

}