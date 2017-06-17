package com.ly.firstboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication
public class DemoApplication{
//public class DemoApplication implements EmbeddedServletContainerCustomizer{

//	启动类 继承EmbeddedServletContainerCustomizer接口，并改写接口的customize方法实现默认访问端口的修改
// AbstractConfigurableEmbeddedServletContainer中配置了Tomcat的端口默认为8080
//可以直接配置TomcatEmbeddedServletContainerFactory的属性修改，继承上述AbstractConfigurableEmbeddedServletContainer

//	@Override
//	public void customize(ConfigurableEmbeddedServletContainer container) {
//		container.setPort(8888);
//
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
