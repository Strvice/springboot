package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
     * @author dalaoyang
     * @Description
     * @project springboot_learn
     * @package com.dalaoyang.Controller
     * @email yangyang@dalaoyang.cn
     * @date 2018/4/9
     */
    @Controller
    public class IndexController {

        @RequestMapping("/index.do")
        public String index()
        {
            User user=new User();

            return "test";
        }
}
