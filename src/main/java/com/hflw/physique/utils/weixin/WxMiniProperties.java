package com.hflw.physique.utils.weixin;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "weixin-mini")
public class WxMiniProperties {

    private String appId;
    private String appSecret;
    private String interfaceUrl;

}
