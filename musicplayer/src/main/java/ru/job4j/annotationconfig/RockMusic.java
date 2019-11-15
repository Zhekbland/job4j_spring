package ru.job4j.annotationconfig;

import org.springframework.stereotype.Component;

/**
 * Class RockMusic get classic song.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Devil in I";
    }
}
