package com.springDB.service;

import com.springDB.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void deleteUser(int id);

    User loadUser(int id);

    List loadAll();

    /*
    *'prop' can be like args of entity.
    * For this example 'prop' can be: "name" or "id" or "email" or "password"
     */
    List loadAllSortedByProp(String prop);

    List loadByEmail(String email);

}
