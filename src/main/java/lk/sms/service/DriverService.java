package lk.sms.service;

import lk.sms.entity.Drivers;

import java.util.List;

public interface DriverService {
    Drivers setLatLong(Drivers drivers);


    List<Drivers> getLatLongs();
}
