package com.training.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/*")
public class FrontController {

    @RequestMapping("/")
    public ModelAndView front_index(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("front/index");

        return mav;
    }

}
