package lk.sms.controller;

import lk.sms.entity.Events;
import lk.sms.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping(value = "/events")
    public Events addEvent(@RequestBody Events events) {
        return eventService.addEvent(events);
    }

    @DeleteMapping(value = "/events/{id}")
    public void deleteEvent(@PathVariable String id) {
        eventService.deleteEvent(id);
    }

    @GetMapping(value = "/events")
    public List<Events> viewAll() {
        return eventService.viewAll();
    }

}
