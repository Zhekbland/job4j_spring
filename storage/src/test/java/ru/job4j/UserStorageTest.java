package ru.job4j;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class UserStorageTest is testing.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 17.11.2019.
 */
public class UserStorageTest {

    @Test
    public void whenWeLoadContextShouldGetBeans() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStorage memory = context.getBean(UserStorage.class);
        List<User> userList = memory.getAll();
        for (User user : userList) {
            System.out.println(user);
        }

//        assertNotNull(memory);
    }

    @Test
    public void whenWeAddUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStorage memory = context.getBean(UserStorage.class);
        boolean result = memory.add(new User("Zheka", 27, "@gmail.com"));
        assertThat(result, is(true));
    }

    @Test
    public void whenWeAddUserAndGetById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStorage memory = context.getBean(UserStorage.class);
        User user = new User("Zheka", 27, "@gmail.com");
        memory.add(user);
        User result = memory.getById(1);
        assertThat(result, is(user));
    }

    @Test
    public void whenWeAddUserAndDeleteIt() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStorage memory = context.getBean(UserStorage.class);
        memory.add(new User("Zheka", 27, "@gmail.com"));
        boolean result = memory.delete(1);
        assertThat(result, is(true));
    }

    @Test
    public void whenWeAddUserAndGetAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStorage memory = context.getBean(UserStorage.class);
        User user1 = new User("Zheka", 27, "1@gmail.com");
        User user2 = new User("Max", 28, "2@gmail.com");
        User user3 = new User("Sam", 29, "3@gmail.com");
        memory.add(user1);
        memory.add(user2);
        memory.add(user3);
        List<User> expected = List.of(user1, user2, user3);
        List<User> result = memory.getAll();
        assertThat(result, is(expected));
    }
}
