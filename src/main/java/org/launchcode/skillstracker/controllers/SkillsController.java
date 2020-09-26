package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return"<h1>Skills Tracker</h1>" +
                "<h2> These are some skills I'd like to learn</h2>" +
                "<ol>" +
                "<li>CSS</li>" +
                "<li>Java</li>" +
                "<li>html</li>" +
                "</ol>";

//        return "<html>" +
//                "<body>" +
//                "<form>" +
//                "<input type = 'text' skill='skill'>" +
//                "<input type='submit' value = 'Skill'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";

    }

}
