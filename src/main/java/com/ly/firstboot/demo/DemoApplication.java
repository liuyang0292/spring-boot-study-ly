package com.ly.firstboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//public class DemoApplication extends SpringBootServletInitializer{
public class DemoApplication{
//public class DemoApplication implements EmbeddedServletContainerCustomizer{

// 修改端口号
//方法1：启动类 继承EmbeddedServletContainerCustomizer接口，并改写接口的customize方法实现默认访问端口的修改
//方法2：可以直接配置TomcatEmbeddedServletContainerFactory的属性修改，继承AbstractConfigurableEmbeddedServletContainer，后者中配置了Tomcat的端口默认为8080
//方法3：配置根目录下application.properties中server.port=8887

//打成war包：
//	继承SpringBootServletInitializer，并重写configure如下；
// pom.xml中添加spring-boot-starter-tomcat provided；
// pom.xml中去除maven插件（未去除也能访问）；
// pom.xml中 <packaging>war</packaging>设置成war；

//	@Override
//	public void customize(ConfigurableEmbeddedServletContainer container) {
//		container.setPort(8888);
//
//	}


//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(this.getClass());
//	}


	//spring boot启动方法，将业务委托给Spring boot中的SpringApplication类
	//SpringApplication引导我们启动spring，启动自动配置好的tomcat web服务器
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
