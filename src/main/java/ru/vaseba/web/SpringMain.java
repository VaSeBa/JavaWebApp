package ru.vaseba.web;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vaseba.model.Role;
import ru.vaseba.model.User;
import ru.vaseba.repository.UserRepository;
import ru.vaseba.service.UserService;

import java.util.Arrays;

public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println("Bean definition names: " + Arrays.toString(appCtx.getBeanDefinitionNames()));

//        UserRepository userRepository = (UserRepository) appCtx.getBean("inmemoryUserRepository");
        UserRepository userRepository = appCtx.getBean(UserRepository.class);
        userRepository.getAll();

//        UserService userService = appCtx.getBean(UserService.class);
//        userService.create(new User(null, "userName", "userMail", "pass", Role.ADMIN));

        appCtx.close();
    }
}
