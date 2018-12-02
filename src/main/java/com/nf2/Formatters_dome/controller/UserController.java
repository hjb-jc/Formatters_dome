package com.nf2.Formatters_dome.controller;

import com.nf2.Formatters_dome.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping("/reg")
    public String register(Model model, User user){
        model.addAttribute("user",user);
        return "result";
    }

    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String log(Model model){
        return "formatter";
    }
}
