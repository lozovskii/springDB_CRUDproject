package com.springDB.repository;

import com.springDB.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends AbstractRepository implements UserRepository {

    public void saveUser(User user) {
        persist(user);
    }

}