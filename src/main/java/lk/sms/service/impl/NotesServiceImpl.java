package lk.sms.service.impl;

import lk.sms.entity.Notes;
import lk.sms.repository.NotesRepository;
import lk.sms.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NotesRepository notesRepository;

    @Override
    public Notes addNote(Notes notes) {
        return notesRepository.save(notes);
    }

    @Override
    public void deleteNote(String id) {
        notesRepository.deleteById(id);
    }

    @Override
    public List<Notes> getNotes(long facultyId) {
        return notesRepository.getNotes(facultyId);
    }
}
