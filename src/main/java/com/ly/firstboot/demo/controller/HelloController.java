package com.ly.firstboot.demo.controller;

import com.ly.firstboot.demo.dao.KeywordDao;
import com.ly.firstboot.demo.entity.Keyword;
import com.ly.firstboot.demo.model.Response;

import com.ly.firstboot.demo.util.MyPropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lyy on 2017-06-17.
 */
@RestController
@RequestMapping("/boot")
@EnableAutoConfiguration
public class HelloController {

    @Autowired
    KeywordDao keywordDao;

    @Autowired
    MyPropertiesUtil myPropertiesUtil;

    @Autowired
    private Environment env;

    @Value("${myproperties.value}")
    private String lyy;

    @RequestMapping(value="/hello/{ID}",method = RequestMethod.GET)
    @ResponseBody
    public Response<String> hello(@PathVariable("ID") Integer id){
        Response<String> re =new Response<>("id="+id+"访问，hahahaha,lalalaala,bababa,nanana，噜噜噜噜，lalaalala!");
        re.setCode(0);
        re.setMsg("success");
        return re;
    }

    /**
     * spring boot 集成hibernate 访问mysql数据库
     * @param id
     * @return
     */
    @RequestMapping(value="/keyword/{ID}",method = RequestMethod.GET)
    @ResponseBody
    public Response<String> getKeyword(@PathVariable("ID") Integer id){
        Response<String> re =new Response<String>();

        if(ObjectUtils.isEmpty(id)){
            re.setCode(-1);
            re.setMsg("id不得为空！");
        }
        StringBuffer sb=new StringBuffer();
        List<Keyword> keywords= keywordDao.findKeywordByStatus(1);
        Keyword key=keywordDao.findOne(id);
        sb.append("状态为1的关键词个数："+keywords.size());
        sb.append(" \n ");
        sb.append("id为").append(""+id).append("的关键词实体name为："+key.getName());
        re.setData(sb.toString());
        re.setCode(0);
        re.setMsg("success");
        return re;
    }

    /**
     * 测试访问属性文件
     * 1.@Value 访问 *.properties 系列配置文件,(yml文件同理)
     * 2.注入Environment ，访问*.properties 系列配置文件
     * 3.@ConfigurationProperties(locations prefix)   1.4后弃用了locations属性
     */
    @RequestMapping(value="/config",method = RequestMethod.GET)
    @ResponseBody
    public Response<String> config(){
        Response<String> re =new Response<>("my.app.config:"+myPropertiesUtil.getAppConfig()
        +" @Value获取获取myproperties中myproperties.value字段:"+lyy
        +" Environment获取myproperties中myproperties.value字段:"+env.getProperty("myproperties.value")
        );
        re.setCode(0);
        re.setMsg("success");
        return re;
    }
}
