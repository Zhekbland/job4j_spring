package ru.job4j.aop.logger;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.job4j.aop.logger.MusicPlayer;

/**
 * MusicPlayerAOPTest is testing AOP functions.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
public class MusicPlayerAOPTest {

    @Test
    public void whenWeGetAspect() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAOP.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
    }
}