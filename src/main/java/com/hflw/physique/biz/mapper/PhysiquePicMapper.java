package com.hflw.physique.biz.mapper;

import com.hflw.physique.framework.mapper.CommonMapper;
import com.hflw.physique.biz.domain.PhysiquePic;

import java.util.List;

public interface PhysiquePicMapper extends CommonMapper<PhysiquePic> {

    List<PhysiquePic> listByPhysiqueId(Integer physiqueId);

}