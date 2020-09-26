package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form>" +
                "<input type = 'text' skill='skill'>" +
                "<input type='submit' value = 'Skill'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

}
