package lk.sms.service;

import lk.sms.dto.LocalMapDTO;
import lk.sms.entity.DocUrl;
import lk.sms.entity.LocalMap;
import lk.sms.entity.ShuttleTimetable;

import java.util.List;

public interface StudentService {
    DocUrl getDocUrl(String degree, String batch);

    List<LocalMapDTO> getLocalMaps();

    List<ShuttleTimetable> getShuttles();
}
