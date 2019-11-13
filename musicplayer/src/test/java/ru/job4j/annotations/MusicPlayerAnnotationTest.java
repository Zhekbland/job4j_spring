package ru.job4j.annotations;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class MusicPlayerAnnotationTest is testing Spring Annotations.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
public class MusicPlayerAnnotationTest {

    @Test
    public void whenWeCreateMusicPlayerAndPlayRockMusicViaAnnotations() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        assertThat(musicPlayer.playMusic(), is("Devil in I"));
        assertThat(musicPlayer.getVolume(), is("100%"));
        assertThat(musicPlayer.getBitrate(), is("320Kb/s"));
    }

}