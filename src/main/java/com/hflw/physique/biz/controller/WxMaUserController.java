package com.hflw.physique.biz.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.hflw.physique.framework.config.wx.WxMaConfiguration;
import com.hflw.physique.framework.core.web.PureR;
import com.hflw.physique.framework.utils.JsonUtils;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 微信小程序用户接口
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@RestController
@RequestMapping("/wx/user/{appid}")
public class WxMaUserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 登陆接口
     */
    @PostMapping(value = "/register", produces = "application/json")
    public PureR login(@PathVariable String appid, @RequestBody Map<String, Object> params) {
        String js_code = (String) params.get("js_code");
        if (StringUtils.isBlank(js_code)) return PureR.error("empty jscode");

        final WxMaService wxService = WxMaConfiguration.getMaService(appid);

        try {
            WxMaJscode2SessionResult session = wxService.getUserService().getSessionInfo(js_code);
            this.logger.info(session.getSessionKey());
            this.logger.info(session.getOpenid());
            //可以增加自己的逻辑，关联业务相关数据
            logger.info(JsonUtils.toJson(session));
            //todo openid入库
            //todo 设置session
            return PureR.success(session);
        } catch (WxErrorException e) {
            this.logger.error(e.getMessage(), e);
            return PureR.error(e.getMessage());
        }
    }

    /**
     * <pre>
     * 获取用户信息接口
     * </pre>
     */
    @GetMapping("/info")
    public PureR info(@PathVariable String appid, String sessionKey,
                      String signature, String rawData, String encryptedData, String iv) {
        final WxMaService wxService = WxMaConfiguration.getMaService(appid);

        // 用户信息校验
        if (!wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return PureR.error("user check failed");
        }

        // 解密用户信息
        WxMaUserInfo userInfo = wxService.getUserService().getUserInfo(sessionKey, encryptedData, iv);

        logger.info(JsonUtils.toJson(userInfo));
        return PureR.success(userInfo);
    }

    /**
     * <pre>
     * 获取用户绑定手机号信息
     * </pre>
     */
    @GetMapping("/phone")
    public PureR phone(@PathVariable String appid, String sessionKey, String signature,
                       String rawData, String encryptedData, String iv) {
        final WxMaService wxService = WxMaConfiguration.getMaService(appid);

        // 用户信息校验
        if (!wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return PureR.error("user check failed");
        }

        // 解密
        WxMaPhoneNumberInfo phoneNoInfo = wxService.getUserService().getPhoneNoInfo(sessionKey, encryptedData, iv);

        logger.info(JsonUtils.toJson(phoneNoInfo));
        return PureR.success(phoneNoInfo);
    }

    /**
     * <pre>
     * 获取用户绑定手机号信息
     * </pre>
     */
    @GetMapping("/udpateWxUserInfo")
    public PureR update(@PathVariable String appid, @RequestBody WxMaUserInfo userInfo) {
        logger.info(JsonUtils.toJson(userInfo));
        return PureR.success();
    }

}
