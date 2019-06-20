package com.zr.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("/xh")
    public String  index(){
        return "wwj";
    }
    
    
    @RequestMapping("/xh1")
    public ModelAndView  index1(){
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("xxx", "xxxx");
    	mv.setViewName("xh1");
        return mv;
    }
}
