package com.toy.board.kim.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KimHomeController {
	@RequestMapping(value = "/KimHome", method = RequestMethod.GET)
    public String home() {
		System.out.println("home controller start");
                   
        return "kim/index";
    }
}
