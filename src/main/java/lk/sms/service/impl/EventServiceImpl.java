package lk.sms.service.impl;

import lk.sms.entity.Events;
import lk.sms.repository.EventsRepository;
import lk.sms.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventsRepository eventsRepository;

    @Override
    public Events addEvent(Events events) {
        return eventsRepository.save(events);
    }

    @Override
    public void deleteEvent(String id) {
        eventsRepository.deleteById(id);
    }

    @Override
    public List<Events> viewAll() {
        return eventsRepository.findAll();
    }
}
