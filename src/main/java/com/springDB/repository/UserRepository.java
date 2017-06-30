package com.springDB.repository;

import com.springDB.model.User;

import java.util.List;

public interface UserRepository {

    void saveUser(User user);

    void deleteUser(int id);

    User loadUser(int id);

    List loadAll();

    List loadAllSortedByProp(String name);

    List loadByEmail(String email);

}
