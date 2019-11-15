package ru.job4j.list;

import java.util.List;

/**
 * Class MusicPlayer create player with list of musics via Spring XML.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
public class MusicPlayer {

    private List<Music> musics;

    public void playMusic() {
        for (Music music : this.musics) {
            System.out.println(music.getSong());
        }
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }
}
