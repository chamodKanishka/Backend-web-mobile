package lk.sms.service.impl;

import lk.sms.dto.LocalMapDTO;
import lk.sms.dto.StudentDTO;
import lk.sms.entity.DocUrl;
import lk.sms.entity.LocalMap;
import lk.sms.entity.ShuttleTimetable;
import lk.sms.entity.Students;
import lk.sms.repository.DocUrlRepository;
import lk.sms.repository.LocalMapRepository;
import lk.sms.repository.ShuttleRepository;
import lk.sms.repository.StudentRepository;
import lk.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private DocUrlRepository docUrlRepository;
    @Autowired
    private LocalMapRepository localMapRepository;
    @Autowired
    private ShuttleRepository shuttleRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DocUrl getDocUrl(String degree, String batch) {
        return docUrlRepository.getDocUrl(degree, batch);
    }

    @Override
    public List<LocalMapDTO> getLocalMaps() {
        List<LocalMap> all = localMapRepository.findAll();
        List<LocalMapDTO> mapDTOS = new ArrayList<>();
        for (LocalMap localMap : all) {
            LocalMapDTO localMapDTO = new LocalMapDTO();
            localMapDTO.setId(localMap.getId());
            localMapDTO.setUser(localMapDTO.new User(localMap.getName()));
            localMapDTO.setSubject(localMap.getSubject());
            localMapDTO.setLocation(localMap.getLocation());
            mapDTOS.add(localMapDTO);
        }

        return mapDTOS;
    }

    @Override
    public List<ShuttleTimetable> getShuttles() {
        return shuttleRepository.findAll();
    }

    @Override
    public StudentDTO getStudent(String email) {
        Students student = studentRepository.getStudent(email);
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setsId(student.getsId());
        studentDTO.setName(student.getName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setBatch(student.getBatch());
        studentDTO.setDegree(student.getDegree());
        studentDTO.setFaculty(student.getFaculty());
        studentDTO.setDocUrl(studentDTO.new DocUrl(docUrlRepository.getDocUrl(student.getDegree(), student.getBatch())));
        return studentDTO;
    }
}
