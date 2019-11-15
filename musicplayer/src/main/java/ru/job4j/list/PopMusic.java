package ru.job4j.list;

/**
 * Class PopMusic get classic song.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Show must go on";
    }
}
