package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

/**
 * Created by hboxs021 on 2018/3/13.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String test(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "/index";
    }

    @RequestMapping(value = "/index3", method = RequestMethod.GET)
    public String index(HashMap<String,Object> map) {
        map.put("hello","spring boot pu ni a mu");
        return "/index";
    }

    @RequestMapping(value = "/index4", method = RequestMethod.GET)
    public String index4(HashMap<String,Object> map) {
        map.put("hello","spring boot pu ni a mu");
        return "index4";
    }
}
