# spring-boot-study-ly
spring boot学习项目

### 2017-6-17
* Spring boot项目部署
* Spring boot项目修改默认端口
* Spring boot项目打成war包
* Spring boot项目热部署支持
* Spring boot项目profiles多环境配置

###### 参考资料
超简易入门，用Spring boot 构件web，输出hello world：[Spring Boot快速入门](http://www.jianshu.com/p/d24bceea7665)

启动器pom依赖快查：[Spring Boot的启动器Starter详解](http://blog.csdn.net/chszs/article/details/50610474)

good again profile：[Spring boot(4)-应用打包部署](http://blog.csdn.net/hguisu/article/details/51072683)

[集成maven和Spring boot的profile功能](http://blog.csdn.net/lihe2008125/article/details/50443491)

---

### 2017-6-19

* Spring boot项目profiles多环境配置

>  配置文件必须放在resources根目录

>  多配置文件命名： application-{profile}.properties

>  application.properties 为默认配置，可覆盖

>  application.properties 中设置 spring.profiles.active=dev ，将使用profile为dev的配置

>  application.properties 中设置 spring.profiles.active=dev ，若dev中对应属性为空或无对应属性，则使用application.properties默认配置

* Spring boot集成hibernate+mysql


###### 参考资料
文章后面部分不错：[51. spring boot属性文件之多环境配置【从零开始学Spring Boot】](http://412887952-qq-com.iteye.com/blog/2307104)

集成jpa hibernate：[SpringBoot整合hibernate](http://blog.csdn.net/supervictim/article/details/54582083)

---
### 2017-6-23

* Spring boot项目配置文件取值

>  配置文件@Value取值

>  配置文件Environment取值

>  配置文件@ConfigurationProperties取值 locations属性不可用

* Spring boot启用Actuator，了解Spring boot 运行时项目的配置信息、运行时度量、应用信息，

>  pom中配置Actuator依赖

>  关闭端口鉴权 management.security.enabled=false

###### 参考资料
[Springboot 之 自定义配置文件及读取配置文件](http://blog.csdn.net/zsl129/article/details/52880798)

[Spring Boot 配置优先级顺序](http://www.cnblogs.com/softidea/p/5759180.html)

Actuator配置依赖后，要配置权限设置[关于springboot-actuator监控的401无权限访问](http://blog.csdn.net/u013076044/article/details/60780151)

---

