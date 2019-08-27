package com.hflw.physique.domain;

import com.hflw.physique.common.domain.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@Data
@Table(name = "pts_physique")
public class Physique extends BaseEntity {

    /**
     * 体质名称
     */
    private String name;

    /**
     * 总体特征
     */
    @Column(name = "general_characteristics")
    private String generalCharacteristics;

    /**
     * 形体特征
     */
    @Column(name = "physical_characteristics")
    private String physicalCharacteristics;

    /**
     * 常见表现
     */
    @Column(name = "common_performance")
    private String commonPerformance;

    /**
     * 心理特征
     */
    @Column(name = "psychological_characteristics")
    private String psychologicalCharacteristics;

    /**
     * 发病倾向
     */
    private String incidence;

    /**
     * 对外界环境适应能力
     */
    @Column(name = "adaptability_external_environment")
    private String adaptabilityExternalEnvironment;

    @Transient
    private List<PhysiqueNurse> nurseList;

    @Transient
    private List<PhysiquePic> picList;

}