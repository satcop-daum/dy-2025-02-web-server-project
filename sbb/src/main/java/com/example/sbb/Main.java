package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main
{

    //GET
    @GetMapping("/sbb")
    @ResponseBody
    public String index()
    {
        return "<h1>안녕하세요. 스프링부트 학습을 시작합니다.</h1>";
    }

}
