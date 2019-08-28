package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
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

}