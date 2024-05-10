package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
public class SkillsController {

    @GetMapping("form")
    public String form() {
return "<!DOCTYPE html>\n" +
        "<html lang=\"en\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <title>Title</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "<div>\n" +
        "    <form action=\"\" method=\"post\">\n" +
        "        <div>\n" +
        "            <label>Name: </label>\n" +
        "            <input type=\"text\" name=\"name\">\n" +
        "        </div>\n" +
        "        <div>\n" +
        "            <label>Fav Language: </label>\n" +
        "            <select name=\"choice1\">\n" +
        "            <option value=\"java\">Java</option>\n" +
        "                <option value=\"javascript\">JavaScript</option>\n" +
        "                <option value=\"html\">HTML</option>\n" +
        "                </select>\n" +
        "        </div>\n" +
        "        <div>\n" +
        "            <label>Fav Language2: </label>\n" +
        "            <select name=\"choice2\">\n" +
        "                <option value=\"java\">Java</option>\n" +
        "                <option value=\"javascript\">JavaScript</option>\n" +
        "                <option value=\"html\">HTML</option>\n" +
        "            </select>\n" +
        "        </div>\n" +
        "        <div>\n" +
        "            <label>Fav Language3: </label>\n" +
        "            <select name=\"choice3\">\n" +
        "                <option value=\"java\">Java</option>\n" +
        "                <option value=\"javascript\">JavaScript</option>\n" +
        "                <option value=\"html\">HTML</option>\n" +
        "            </select>\n" +
        "        </div>\n" +
        "        <div>\n" +
        "            <input type=\"submit\" value=\"Submit\">\n" +
        "        </div>\n" +
        "    </form>\n" +
        "</div>\n" +
        "</body>\n" +
        "</html>";
    }

    @PostMapping("form")
    public String skillsChoices(@RequestParam String name, String choice1, String choice2, String choice3){
        return "<h1>"+name+"</h1>"+
                "<ol><li>"+choice1+"</li>"+
                "<li>"+choice2+"</li>"+
                "<li>"+choice3+"</li></ol>";
    }
}
