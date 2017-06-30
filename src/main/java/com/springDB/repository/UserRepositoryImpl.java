package com.springDB.repository;

import com.springDB.model.User;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl extends AbstractRepository implements UserRepository {

    public void saveUser(User user) {
        persist(user);
    }

    public void deleteUser(int id) {
        Object persistentInstance = getSession().load(User.class, id);
        if (persistentInstance != null){
            getSession().delete(persistentInstance);
        }
    }

    public User loadUser(int id){
        return (User) getSession().get(User.class, id);
    }

    public List loadAll() {
        return getSession().createCriteria(User.class).list();
    }

    public List loadAllSortedByProp(String prop) {
        return getSession().createCriteria(User.class).addOrder(Order.asc(prop)).list();
    }

    public List loadByEmail(String email) {
        String hql = "from User U WHERE U.email=:email";
        Query query = getSession().createQuery(hql);
        query.setParameter("email", email);
        return query.list();
    }
}