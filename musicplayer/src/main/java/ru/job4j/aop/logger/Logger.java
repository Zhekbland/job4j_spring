package ru.job4j.aop.logger;

import org.springframework.stereotype.Component;

/**
 * Class Logger is an Aspect.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
@Component()
public class Logger {
    public void printValue(Object obj) {
        System.out.println(obj);
    }

    public void init() {
        System.out.println("init");
    }

    public void close() {
        System.out.println("close");
    }
}
