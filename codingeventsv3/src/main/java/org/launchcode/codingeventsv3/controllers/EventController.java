package org.launchcode.codingeventsv3.controllers;

import org.launchcode.codingeventsv3.data.EventData;
import org.launchcode.codingeventsv3.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String createEventHandler(@ModelAttribute Event newEvent) {
        EventData.add(newEvent);
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

    // CREATE 2 HANDLER METHODS HERE:

    @GetMapping("edit/{eventId}")
    public String displayEditForm(Model model, @PathVariable int eventId) {

        //CONTROLLER CODE HERE:
            Event eventToEdit = EventData.getById(eventId);
            model.addAttribute("event", eventToEdit);
            String title = "Edit Event" + eventToEdit.getName() + "(id=" + eventToEdit.getId() + ")";

            model.addAttribute("title", title);
            return "events/edit";
        }


    @PostMapping("edit")
    public String processEditForm(@RequestParam int eventId, String name, String description) {
        //controller code here
        Event eventToEdit = EventData.getById(eventId);
        eventToEdit.setName(name);
        eventToEdit.setDescription(description);
        return "redirect:/events";
    }

}
