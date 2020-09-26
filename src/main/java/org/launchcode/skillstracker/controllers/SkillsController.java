package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String skillsList() {
        return "<h1>Skills Tracker</h1>" +
                "<h2> These are some skills I'd like to learn</h2>" +
                "<ol>" +
                "<li>CSS</li>" +
                "<li>Java</li>" +
                "<li>html</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillForm(){

        return "<form action = 'form' method = 'post'>" +
                "<input type= 'text' name ='name'><br />" +
                "<label>Zeroth Favorite</label><br />" +
                "<select name ='skill0'>" +
                "<option value ='Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "</select><br />" +
                "<label>First favorite</label><br />" +
                "<select name ='skill1'>" +
                "<option value ='Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "</select><br />" +
                "<label>Third</label><br />" +
                "<select name ='skill2'>" +
                "<option value ='Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "</select><br />" +
                "<input type='submit' value = 'Skill'>" +
                  "</form>";


    }
    @PostMapping("form")
    @ResponseBody
    public String processForm(@RequestParam String name, @RequestParam String skill0, @RequestParam String skill1, String skill2){
        return "<h1>" + name + "</h1> <br/>" +
                "<ol>" +
                "<li> " + skill0 + "</li>" +
                "<li> " + skill1 + "</li>" +
                "<li> " + skill2 + "</li>" +
                "</ol>";
    }

}
