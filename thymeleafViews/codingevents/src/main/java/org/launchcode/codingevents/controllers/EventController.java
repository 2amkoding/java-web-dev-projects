package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    @GetMapping
    public String eventHandler(Model model) {
//        List<String> events = new ArrayList<>();
//            events.add("Black Coffee");
//            events.add("Beyond Wonderland");
//            events.add("Fred Again..Live");
//            events.add("Boiler Room");
            model.addAttribute("events", events);
            return "events/index";
    }

    @GetMapping("create") //events/create
    public String renderCreateEventForm() {
        return "events/create";
    }
    @PostMapping("create") //---> events/create
    public String createEvent(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:/events";
    }
}
