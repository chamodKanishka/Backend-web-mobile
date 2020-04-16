package lk.sms.service;

import lk.sms.entity.User;

import java.util.List;

public interface UserService {
    boolean checkUser(User user);

    List<User> viewAll();

    User Register(User user);
}
