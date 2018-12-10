package com.hxl.hxlspringboot01.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyControllerAdvice {

    /**
     * 全局异常捕获
     *
     * @param e
     * @return
     */

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map erroyHandler(Exception e) {
        Map map = new HashMap();
        map.put("code", 404);
        map.put("msg", e.getMessage());
        return map;
    }


}
