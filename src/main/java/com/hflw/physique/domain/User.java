package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

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

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取微信公众号openid
     *
     * @return wx_openid - 微信公众号openid
     */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
     * 设置微信公众号openid
     *
     * @param wxOpenid 微信公众号openid
     */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    /**
     * 获取小程序openid
     *
     * @return mini_openid - 小程序openid
     */
    public String getMiniOpenid() {
        return miniOpenid;
    }

    /**
     * 设置小程序openid
     *
     * @param miniOpenid 小程序openid
     */
    public void setMiniOpenid(String miniOpenid) {
        this.miniOpenid = miniOpenid;
    }

}