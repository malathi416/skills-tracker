package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class SkillsController {
    @GetMapping
    public String skillsTracker(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2> We have a few skills we would like to learn.Here is the list. </h2>" +
                        "<ol>" +
                        "<li> Java Script</li>" +
                        "<li> Angular Java Script </li>" +
                        "<li> Java </li>" +
                        "</ol>" +
                        "</form>" +
                        "</body>" +
                        "</html";
        return html;
    }
    @GetMapping("form")
    public String skillsTrackerForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form action='form' method='post'>" +
                        "<label> Name: </label> <br>" +
                        "<input type = 'text' value='' name='name' ></input><br>" +
                        "<label> My Favourite Language : </label><br>" +
                        "<select name = 'language1'>" +
                        "<option >please choose language </option>" +
                        "<option value='Java Script'> Java Script </option>" +
                        "<option >Angular Java Script</option>" +
                        "<option > Java </option></select><br>"+
                        "<label> My Second Favourite Language : </label><br>" +
                        "<select name = 'language2'>" +
                        "<option >please choose language </option>" +
                        "<option > Java Script </option>" +
                        "<option >Angular Java Script</option>" +
                        "<option > Java </option></select><br>"+
                        "<label> My Third Favourite Language : </label><br>" +
                        "<select name = 'language3'>" +
                        "<option> please choose language </option>" +
                        "<option>  Java Script </option>" +
                        "<option>  Angular Java Script </option>" +
                        "<option>  Java </option></select> <br>" +
                        "<input type='Submit' value='Submit'></input>";
        return html;
    }
    @PostMapping("form")
    public String skillsTrackerRequestForm(@RequestParam String name, String language1,String language2,String language3){
        String html=
                "<html>" +
                        "<body>" +

                        "<h1>" + name + "</h1><br>" +
                        "<ol>" +
                        "<li>"+ language1+"</li>" +
                        "<li>"+ language2 +"</li>"+
                        "<li>"+ language3 +"</li>"+

                        "</body>" +
                        "</html>";

        return html;
    }
}
