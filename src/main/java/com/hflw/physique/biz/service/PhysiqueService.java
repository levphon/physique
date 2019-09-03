package com.hflw.physique.biz.service;

import com.hflw.physique.biz.domain.Physique;
import com.hflw.physique.biz.domain.PhysiqueNurse;
import com.hflw.physique.biz.domain.PhysiquePic;
import com.hflw.physique.biz.mapper.PhysiqueMapper;
import com.hflw.physique.biz.mapper.PhysiqueNurseMapper;
import com.hflw.physique.biz.mapper.PhysiquePicMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PhysiqueService {

    @Resource
    private PhysiqueMapper physiqueMapper;

    @Resource
    private PhysiqueNurseMapper physiqueNurseMapper;

    @Resource
    private PhysiquePicMapper physiquePicMapper;

    public List<Physique> list() {
        List<Physique> list = physiqueMapper.selectAll();
        for (Physique p : list) {
            List<PhysiqueNurse> nurseList = physiqueNurseMapper.listByPhysiqueId(p.getId());
            List<PhysiquePic> picList = physiquePicMapper.listByPhysiqueId(p.getId());
            p.setNurseList(nurseList);
            p.setPicList(picList);
        }
        return list;
    }

    public Physique getById(Integer physiqueId) {
        Physique physique = physiqueMapper.selectByPrimaryKey(physiqueId);
        List<PhysiqueNurse> nurseList = physiqueNurseMapper.listByPhysiqueId(physique.getId());
        List<PhysiquePic> picList = physiquePicMapper.listByPhysiqueId(physique.getId());
        return physique;
    }

}
