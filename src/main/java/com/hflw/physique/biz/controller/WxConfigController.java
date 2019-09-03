package com.hflw.physique.biz.controller;

import com.hflw.physique.framework.config.wx.WxMaConfiguration;
import com.hflw.physique.framework.core.web.PureR;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/wx/config/")
public class WxConfigController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 登陆接口
     */
    @GetMapping("/get")
    public PureR get(String type) {
        if (StringUtils.isBlank(type)) return PureR.error("empty type");

        Set<String> appidSet = WxMaConfiguration.getProperties();

        return PureR.success(appidSet);
    }

}
