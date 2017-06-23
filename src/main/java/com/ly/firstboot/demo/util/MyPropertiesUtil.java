package com.ly.firstboot.demo.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 自定义配置文件，绑定到bean
 * 官方不建议
 * Created by lyy on 2017-06-23.
 */
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix="my.app")
@PropertySource("myproperties.properties")
public class MyPropertiesUtil {

    private String config;

    public String getAppConfig() {
        return config;
    }

    public void setAppConfig(String config) {
        this.config = config;
    }
}
