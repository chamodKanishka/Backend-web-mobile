package lk.sms.controller;

import lk.sms.dto.LocalMapDTO;
import lk.sms.dto.StudentDTO;
import lk.sms.entity.*;
import lk.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/docUrl/{degree}/{batch}")
    public DocUrl getDocUrl(@PathVariable String degree, @PathVariable String batch) {
        return studentService.getDocUrl(degree, batch);
    }

    @GetMapping(value = "/localMap")
    public List<LocalMapDTO> getLocalMaps() {
        return studentService.getLocalMaps();
    }

    @GetMapping(value = "/shuttles")
    public List<ShuttleTimetable> getShuttles() {
        return studentService.getShuttles();
    }

    @GetMapping(value = "/student/{email}")
    public StudentDTO getStudent(@PathVariable String email){
        return studentService.getStudent(email);
    }
}
