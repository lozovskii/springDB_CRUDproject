package com.springDB;

import com.springDB.config.AppConfig;
import com.springDB.model.User;
import com.springDB.service.UserService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class userServiceTest {

    @Autowired
    private UserService userService;

    @Test
    @Ignore
    public void shouldAddToDB(){
        User Addeduser = new User("normAddToDBTest@gmail.com", "Ivan", "kolo96");
        userService.saveUser(Addeduser);
    }

    @Test
    @Ignore
    public void shouldDeleteFromDB(){
        User deletedUser = new User("mail.mail@gmail.com", "TestForDeleting", "testpass");
        userService.saveUser(deletedUser);

        userService.deleteUser(deletedUser.getId());
    }

    @Test
    @Ignore
    public void shouldLoadFromDB(){

        User loadUser = userService.loadUser(15);

        System.out.println(loadUser);

        assertThat(loadUser.getId(), is(notNullValue()));
    }

    @Test
    @Ignore
    public void shouldLoadAllSelectsFromDB(){

        List listAll = userService.loadAll();

        System.out.println(listAll);

        assertThat(listAll.size(), is(notNullValue()));
    }

    @Test
    @Ignore
    public void shouldLoadByProp(){

        List listByProp = userService.loadAllSortedByProp("name");

        System.out.println(listByProp);

        assertThat(listByProp.size(), is(notNullValue()));
    }

    @Test
    public void shouldGetAllWithEmail(){

        String email = "kolomiec96@gmail.com";

        List listByEmail = userService.loadByEmail(email);

        System.out.println(listByEmail);

        assertThat(listByEmail.size(), is(notNullValue()));

    }
}
