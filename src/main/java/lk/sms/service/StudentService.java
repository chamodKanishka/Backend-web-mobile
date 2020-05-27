package lk.sms.service;

import lk.sms.dto.LocalMapDTO;
import lk.sms.dto.StudentDTO;
import lk.sms.entity.*;

import java.util.List;

public interface StudentService {
    DocUrl getDocUrl(String degree, String batch);

    List<LocalMapDTO> getLocalMaps();

    List<ShuttleTimetable> getShuttles();

    StudentDTO getStudent(String email);
}
