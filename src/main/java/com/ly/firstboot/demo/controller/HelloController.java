package com.ly.firstboot.demo.controller;

import com.ly.firstboot.demo.dao.KeywordDao;
import com.ly.firstboot.demo.entity.Keyword;
import com.ly.firstboot.demo.model.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.json.JacksonJsonParser;
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
    private KeywordDao keywordDao;

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
}
