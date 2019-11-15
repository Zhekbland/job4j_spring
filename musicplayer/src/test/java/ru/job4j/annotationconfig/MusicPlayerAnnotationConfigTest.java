package ru.job4j.annotationconfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MusicPlayerAnnotationConfigTest {

    @Test
    public void whenWeCreateMusicPlayerAndPlayRockMusicViaAnnotationsConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        assertThat(musicPlayer.playMusic(), is("Devil in I"));
        assertThat(musicPlayer.getVolume(), is("100%"));
        assertThat(musicPlayer.getBitrate(), is("320Kb/s"));
    }
}