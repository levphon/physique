package com.hflw.physique.biz.mapper;

import com.hflw.physique.framework.mapper.CommonMapper;
import com.hflw.physique.biz.domain.PhysiqueNurse;

import java.util.List;

public interface PhysiqueNurseMapper extends CommonMapper<PhysiqueNurse> {

    List<PhysiqueNurse> listByPhysiqueId(Integer physiqueId);

}