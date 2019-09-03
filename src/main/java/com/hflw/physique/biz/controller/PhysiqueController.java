package com.hflw.physique.biz.controller;

import com.hflw.physique.framework.controller.BaseController;
import com.hflw.physique.framework.core.web.PureR;
import com.hflw.physique.biz.domain.Physique;
import com.hflw.physique.biz.service.PhysiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/physique")
public class PhysiqueController extends BaseController {

    @Autowired
    private PhysiqueService physiqueService;

    @GetMapping("/list")
    public PureR list() {
        List<Physique> list = physiqueService.list();
        return PureR.success(list);
    }

    @GetMapping("/id/{id}")
    public PureR id(@PathVariable("id") Integer physiqueId) {
        Physique physique = physiqueService.getById(physiqueId);
        return PureR.success(physique);
    }

}
