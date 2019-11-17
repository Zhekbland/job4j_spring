package ru.job4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Class UserStorage stores users in database or in memory.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 17.11.2019.
 */
@Component
public class UserStorage {

    private final Storage storage;

    @Autowired
    public UserStorage(@Qualifier("memoryStorage") final Storage storage) {
        this.storage = storage;
    }

    public boolean add(User user) {
        return this.storage.add(user);
    }

    public boolean delete(int id) {
        return this.storage.delete(id);
    }

    public User getById(int id) {
        return this.storage.getById(id);
    }

    public List<User> getAll() {
        return this.storage.getAll();
    }
}
