package com.muraveva.springboot.config;

import com.muraveva.springboot.model.User;
import com.muraveva.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class DataInitializer {

    private final UserService userService;

    @Autowired
    public DataInitializer(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void init() {

        User user = new User();
        user.setName("Anna");
        user.setSurname("Muraveva");
        user.setEmail("Test1@mail.ru");

        User user2 = new User();
        user2.setName("Artem");
        user2.setSurname("Muravev");
        user2.setEmail("Test2@mail.ru");

        User user3 = new User();
        user3.setName("Ivan");
        user3.setSurname("Ivanov");
        user3.setEmail("Test3@mail.ru");

        User user4 = new User();
        user4.setName("Petr");
        user4.setSurname("Petrov");
        user4.setEmail("Test4@mail.ru");

        User user5 = new User();
        user5.setName("Semen");
        user5.setSurname("Kruglov");
        user5.setEmail("Test5@mail.ru");

        userService.addUser(user);
        userService.addUser(user2);
        userService.addUser(user3);
        userService.addUser(user4);
        userService.addUser(user5);
    }

}
