package com.hflw.physique.utils.weixin;

import org.springframework.web.context.ContextLoader;

public class WeiXinPropertiesUtils {

    // 微信公众号配置
    private static WxProperties wxProperties;

    // 微信小程序配置
    private static WxMiniProperties miniProperties;

    private static void init() {
        if (miniProperties == null) {
            miniProperties = ContextLoader.getCurrentWebApplicationContext().getBean(WxMiniProperties.class);
        }
        if (wxProperties == null) {
            wxProperties = ContextLoader.getCurrentWebApplicationContext().getBean(WxProperties.class);
        }
    }

    public static WxMiniProperties getWxMiniProperties() {
        init();
        return miniProperties;
    }

    public static WxProperties getWxProperties() {
        init();
        return wxProperties;
    }

}
