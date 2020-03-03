package lk.sms.service.impl;

import lk.sms.entity.User;
import lk.sms.repository.UserRepository;
import lk.sms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean checkUser(User user) {
        List<User> userList = userRepository.findAll();
        return false;
    }

    @Override
    public List<User> viewAll() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
