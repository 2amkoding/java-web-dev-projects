package org.launchcode.codingeventsv3.controllers;

import org.launchcode.codingeventsv3.data.EventData;
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
    @GetMapping
    public String handlerMethodName(Model model) {
       // List<String> events = new ArrayList<>();
        model.addAttribute("events", EventData.getAll());
        return "events/index";
    }


    @GetMapping("create")
    public String renderEventForm() {
        return "events/create";
    }


    @PostMapping("create")
    public String createEventHandler(@RequestParam String eventName, @RequestParam String eventDescription) {
        EventData.add(new Event(eventName, eventDescription));
        return "redirect:/events";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String CreateDeleteHandler(@RequestParam(required = false) int[] eventIds) {
       if(eventIds != null){
           for(int id : eventIds) {
               EventData.remove(id);
           }
       }

        return "redirect:/events";
    }
}
