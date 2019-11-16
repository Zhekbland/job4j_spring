package ru.job4j.aop.timecheckerinterface;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCheckFunction {
    @Test
    public void whenWeCheckTimeOfExecution() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAOPTimeCheckInterface.xml");
        CheckFunction functions = context.getBean(CheckFunction.class);
        functions.doSomething1();
        functions.doSomething2();
    }
}