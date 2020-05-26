package lk.sms.service;

import lk.sms.entity.Events;

import java.util.List;

public interface EventService {
    Events addEvent(Events events);

    void deleteEvent(String id);

    List<Events> viewAll();
}
