package lk.sms.controller;

import lk.sms.entity.User;
import lk.sms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/checkUser")
    public boolean checkUser(@RequestBody User user){
        return userService.checkUser(user);
    }

    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping(value = "/viewAll")
    public List<User> checkUser(){
        return userService.viewAll();
    }
}