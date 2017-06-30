package com.springDB.service;

import com.springDB.model.User;
import com.springDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }

    public User loadUser(int id) {
        return userRepository.loadUser(id);
    }

    public List loadAll() {
        return userRepository.loadAll();
    }

    public List loadAllSortedByProp(String prop) {
        return userRepository.loadAllSortedByProp(prop);
    }

    public List loadByEmail(String email) {
        return userRepository.loadByEmail(email);
    }


}
