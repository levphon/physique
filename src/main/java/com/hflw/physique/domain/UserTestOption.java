package com.hflw.physique.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "pts_user_test_option")
public class UserTestOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 测试id
     */
    @Column(name = "test_id")
    private Integer testId;

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

    /**
     * 启用状态：0启用，1停用
     */
    @Column(name = "enable_status")
    private Byte enableStatus;

    /**
     * 删除状态：0未删除，1删除
     */
    @Column(name = "delete_status")
    private Byte deleteStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取测试id
     *
     * @return test_id - 测试id
     */
    public Integer getTestId() {
        return testId;
    }

    /**
     * 设置测试id
     *
     * @param testId 测试id
     */
    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    /**
     * 获取问题id
     *
     * @return question_id - 问题id
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置问题id
     *
     * @param questionId 问题id
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取回答项,可能多选,多个id逗号分隔
     *
     * @return option_ids - 回答项,可能多选,多个id逗号分隔
     */
    public String getOptionIds() {
        return optionIds;
    }

    /**
     * 设置回答项,可能多选,多个id逗号分隔
     *
     * @param optionIds 回答项,可能多选,多个id逗号分隔
     */
    public void setOptionIds(String optionIds) {
        this.optionIds = optionIds;
    }

    /**
     * 获取分值
     *
     * @return score - 分值
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置分值
     *
     * @param score 分值
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取启用状态：0启用，1停用
     *
     * @return enable_status - 启用状态：0启用，1停用
     */
    public Byte getEnableStatus() {
        return enableStatus;
    }

    /**
     * 设置启用状态：0启用，1停用
     *
     * @param enableStatus 启用状态：0启用，1停用
     */
    public void setEnableStatus(Byte enableStatus) {
        this.enableStatus = enableStatus;
    }

    /**
     * 获取删除状态：0未删除，1删除
     *
     * @return delete_status - 删除状态：0未删除，1删除
     */
    public Byte getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置删除状态：0未删除，1删除
     *
     * @param deleteStatus 删除状态：0未删除，1删除
     */
    public void setDeleteStatus(Byte deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}