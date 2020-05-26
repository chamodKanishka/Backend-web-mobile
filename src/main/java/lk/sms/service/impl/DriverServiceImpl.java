package lk.sms.service.impl;

import lk.sms.entity.Drivers;
import lk.sms.repository.DriverRepository;
import lk.sms.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;


    @Override
    public Drivers setLatLong(Drivers drivers) {
        return driverRepository.save(drivers);
    }

    @Override
    public List<Drivers> getLatLongs() {
        return driverRepository.findAll();
    }
}
