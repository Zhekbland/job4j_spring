package ru.job4j.list;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class MusicPlayerTest {

    @Test
    public void whenWeConfigurateSpringVIAXMLAndGetListOfMusics() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextList.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
    }
}