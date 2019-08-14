package com.hflw.physique.utils.weixin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class WeiXinUtils {

    private static Logger log = LoggerFactory.getLogger(WeiXinUtils.class);

    /**
     * 通过前端传过来的code, 调用小程序登录接口, 获取到message并返回 (包含openid session_key等)
     *
     * @param code
     * @return
     */
    public static JSONObject login(String code) {
        log.info("==============小程序登录方法开始================");
        WxMiniProperties properties = WeiXinPropertiesUtils.getWxMiniProperties();
        String url = properties.getInterfaceUrl() + "/sns/jscode2session?appid="
                + properties.getAppId() + "&secret=" + properties.getAppSecret()
                + "&js_code=" + code + "&grant_type=authorization_code";
        JSONObject message;
        try {
            // RestTemplate是Spring封装好的, 挺好用, 可做成单例模式
            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(url, String.class);
            message = JSON.parseObject(response);
        } catch (Exception e) {
            log.error("微信服务器请求错误", e);
            message = new JSONObject();
        }
        log.info("message：" + message.toString());
        log.info("==============小程序登录方法结束================");
        return message;

        // 后续, 可获取openid session_key等数据, 以下代码一般放在Service层
        //if (message.get("errcode") != null) {
        //    throw new ValidationException(message.toString());
        //}
        //String openid = message.get("openid").toString();
        //String sessionKey = message.get("session_key").toString();
        //...
    }

}
