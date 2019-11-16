package ru.job4j.aop.timecheckerannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Class Logger around method and check time of execution.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 16.11.2019.
 */
@Component
@Aspect
public class TimeCheckLogger {

    @Pointcut("execution(* *(..))")
    public void allMethods() {

    }

    @Around("allMethods()")
    public Object watchTime(ProceedingJoinPoint joinPoint) {
        long start = System.currentTimeMillis();
        System.out.println("method starts: " + joinPoint.getSignature().toShortString());
        Object output = null;
        try {
            output = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("method end " + joinPoint.getSignature().toShortString()
                + ", time=" + time + " ms");
        return output;
    }

    @Before("allMethods()")
    public void init() {
        System.out.println("init");
    }

    @After("allMethods()")
    public void close() {
        System.out.println("close");
    }
}