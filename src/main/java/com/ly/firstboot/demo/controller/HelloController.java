package com.ly.firstboot.demo.controller;

import com.ly.firstboot.demo.model.Response;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lyy on 2017-06-17.
 */
@RestController
@RequestMapping("/boot")
public class HelloController {
    @RequestMapping(value="/hello/{ID}",method = RequestMethod.GET)
    @ResponseBody
    public Response<String> hello(@PathVariable("ID") Integer id){
        Response<String> re =new Response<>("id="+id+"访问，hahahaha,lalalaala");
        re.setCode(0);
        re.setMsg("success");
        return re;
    }
}
