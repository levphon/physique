package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "pts_user_test")
public class UserTest extends BaseEntity {

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 总分值
     */
    private Integer score;

    /**
     * 测试完成状态:0未完成，1完成
     */
    private Byte status;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取总分值
     *
     * @return score - 总分值
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置总分值
     *
     * @param score 总分值
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取测试完成状态:0未完成，1完成
     *
     * @return status - 测试完成状态:0未完成，1完成
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置测试完成状态:0未完成，1完成
     *
     * @param status 测试完成状态:0未完成，1完成
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

}