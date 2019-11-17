package ru.job4j;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class MemoryStorage implements Storage in memory.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 17.11.2019.
 */
@Component
public class MemoryStorage implements Storage {

    private final Map<Integer, User> userMap = new ConcurrentHashMap<>();

    private volatile AtomicInteger id = new AtomicInteger();

    @Override
    public boolean add(User user) {
        boolean result = true;
        if (!this.userMap.containsValue(user)) {
            int userId = id.incrementAndGet();
            user.setId(userId);
            this.userMap.put(user.getId(), user);
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = true;
        if (this.userMap.containsKey(id)) {
            this.userMap.remove(id);
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public User getById(int id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(this.userMap.values());
    }
}
