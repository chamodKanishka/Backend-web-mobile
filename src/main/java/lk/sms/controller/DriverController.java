package lk.sms.controller;

import lk.sms.entity.Drivers;
import lk.sms.entity.Notes;
import lk.sms.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping(value = "/driver")
    public Drivers setLatLong(@RequestBody Drivers drivers) {
        return driverService.setLatLong(drivers);
    }

    @GetMapping(value = "/drivers")
    public List<Drivers> getLatLongs() {
        return driverService.getLatLongs();
    }
}
