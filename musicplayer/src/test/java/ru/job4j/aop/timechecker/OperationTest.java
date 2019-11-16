package ru.job4j.aop.timechecker;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class OperationTest is testing.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 16.11.2019.
 */
public class OperationTest {
    @Test
    public void whenWeCheckTimeOfExecution() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAOPTimeCheck.xml");
        Operation operation = context.getBean(Operation.class);
        operation.doSomething1();
        operation.doSomething2();
    }
}