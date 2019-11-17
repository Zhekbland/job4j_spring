package ru.job4j;

import java.util.List;

/**
 * Interface Storage.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 17.11.2019.
 */
public interface Storage {
    boolean add(User user);
    boolean delete(int id);
    User getById(int id);
    List<User> getAll();
}
