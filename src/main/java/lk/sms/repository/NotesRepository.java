package lk.sms.repository;

import lk.sms.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NotesRepository extends JpaRepository<Notes, String> {

    @Query(value = "FROM Notes WHERE faculty.id=?1")
    List<Notes> getNotes(long facultyId);

}
