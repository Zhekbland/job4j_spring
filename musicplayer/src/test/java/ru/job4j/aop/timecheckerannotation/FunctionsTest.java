package ru.job4j.aop.timecheckerannotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FunctionsTest {
    @Test
    public void whenWeCheckTimeOfExecution() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAOPTimeCheckAnnotation.xml");
        Functions functions = context.getBean(Functions.class);
        functions.doSomething1();
        functions.doSomething2();
    }
}