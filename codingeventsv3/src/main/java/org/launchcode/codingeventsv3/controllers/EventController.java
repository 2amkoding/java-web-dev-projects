package org.launchcode.codingeventsv3.controllers;

import org.launchcode.codingeventsv3.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/events")
public class EventController {

    private static List<Event> events = new ArrayList<>();

    @GetMapping
    public String handlerMethodName(Model model) {
       // List<String> events = new ArrayList<>();
        model.addAttribute("events", events);
        return "events/index";
    }


    @GetMapping("create")
    public String renderEventForm() {
        return "events/create";
    }


    @PostMapping("create")
    public String createEventHandler(@RequestParam String eventName) {
        events.add(new Event(eventName));
        return "redirect:/events";
    }
}
