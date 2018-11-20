package com.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class AnnotationHandler {
    /**
     * 业务方法
     */
    @RequestMapping("/modelAndViewTest")
    public ModelAndView modelAndViewTest(){
        //       处理具体的业务逻辑
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据
        modelAndView.addObject("name","modelAndViewTest");
//        添加逻辑视图
        modelAndView.setViewName("show");
        return modelAndView;
    }
    /**
     * 业务方法：model传值，string作为视图解析
     */
    @RequestMapping("/ModelTest")
    public String ModelTest(Model model){
        model.addAttribute("name","modeltest");
        return "show";
    }
    /**
     * 业务：map传值
     */
    @RequestMapping("/MapTEst")
    public String MapTest(Map<String,String> map){
        map.put("name","cat");
        return "show";
    }
}
