package lk.sms.service;

import lk.sms.entity.Events;
import lk.sms.entity.Notes;

import java.util.List;

public interface NotesService {
    Notes addNote(Notes notes);

    void deleteNote(String id);

    List<Notes> getNotes(long facultyId);
}
