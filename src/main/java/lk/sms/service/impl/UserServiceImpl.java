package lk.sms.service.impl;

import lk.sms.entity.User;
import lk.sms.repository.UserRepository;
import lk.sms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService { //database implementation{Logical}

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(User user) {
        return userRepository.getUser(user.getUserEmail(), user.getUserPassword(), user.getUserRole());
    }

    @Override
    public List<User> viewAll() {
        List<User> all = userRepository.findAll();
        Collections.reverse(all);
        return all;
    }

    @Override
    public User Register(User user) {
        return userRepository.save(user);
    }
}
