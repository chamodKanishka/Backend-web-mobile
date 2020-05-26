package lk.sms.controller;

import lk.sms.entity.Notes;
import lk.sms.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/notes")
public class NotesController {

    @Autowired
    private NotesService notesService;

    @PostMapping(value = "/notes")
    public Notes addNote(@RequestBody Notes notes) {
        return notesService.addNote(notes);
    }

    @DeleteMapping(value = "/notes/{id}")
    public void deleteNote(@PathVariable String id) {
        notesService.deleteNote(id);
    }

    @GetMapping(value = "/notes/{facultyId}")
    public List<Notes> getNotes(@PathVariable long facultyId) {
        return notesService.getNotes(facultyId);
    }

}
