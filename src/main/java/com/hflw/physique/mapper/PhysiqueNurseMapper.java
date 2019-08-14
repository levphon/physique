package com.hflw.physique.mapper;

import com.hflw.physique.common.mapper.CommonMapper;
import com.hflw.physique.domain.PhysiqueNurse;

import java.util.List;

public interface PhysiqueNurseMapper extends CommonMapper<PhysiqueNurse> {

    List<PhysiqueNurse> listByPhysiqueId(Integer physiqueId);

}