package ru.job4j.list;

/**
 * Class ClassicMusic get classic song.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Symphony № 7";
    }
}
