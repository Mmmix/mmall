package com.mmall.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("test.do")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("fun.do")
    public String fun(){
        return "login";
    }
}
