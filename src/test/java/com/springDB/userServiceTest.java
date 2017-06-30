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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class userServiceTest {

    @Autowired
    private UserService userService;

    @Test
    @Ignore
    public void shouldAddToDB(){
        User user = new User("normAddToDBTest@gmail.com", "Ivan", "kolo96");
        userService.saveUser(user);
    }
}
