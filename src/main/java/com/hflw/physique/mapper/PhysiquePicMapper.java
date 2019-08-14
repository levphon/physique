package com.hflw.physique.mapper;

import com.hflw.physique.common.mapper.CommonMapper;
import com.hflw.physique.domain.PhysiquePic;

import java.util.List;

public interface PhysiquePicMapper extends CommonMapper<PhysiquePic> {

    List<PhysiquePic> listByPhysiqueId(Integer physiqueId);

}