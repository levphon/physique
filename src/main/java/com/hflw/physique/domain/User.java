package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Setter
@Getter
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