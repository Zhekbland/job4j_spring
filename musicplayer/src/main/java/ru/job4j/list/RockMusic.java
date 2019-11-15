package ru.job4j.list;

/**
 * Class RockMusic get classic song.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Devil in I";
    }
}
