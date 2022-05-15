package com.example.firstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","지연");
        return "greeting"; //templates/greetings.mustache->브라우저로 전송
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username","지연");
        return "bye";
    }
}
