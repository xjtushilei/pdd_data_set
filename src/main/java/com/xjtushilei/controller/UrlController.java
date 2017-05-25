package com.xjtushilei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * @author shilei
 * @Date 2017/5/25.
 */
@Controller
public class UrlController {
    @GetMapping("/**/*")
    public String index(Model model, HttpServletRequest request) {
        String subject = String.valueOf(request.getRequestURL());
        model.addAttribute("subject", subject);
        return "/index";
    }

}
