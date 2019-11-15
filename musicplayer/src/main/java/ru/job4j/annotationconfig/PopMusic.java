package ru.job4j.annotationconfig;

import org.springframework.stereotype.Component;

/**
 * Class PopMusic get classic song.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
@Component("popMusic")
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Show must go on";
    }
}
