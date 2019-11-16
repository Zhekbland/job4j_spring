package ru.job4j.aop.timechecker;

import org.springframework.stereotype.Component;

/**
 * Class Operation does something.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 16.11.2019.
 */
@Component
public class Operation {
    public void doSomething1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doSomething2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}