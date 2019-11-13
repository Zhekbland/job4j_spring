package ru.job4j.xml;

/**
 * Class MusicPlayer create player via Spring XML.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
public class MusicPlayer {

    private Music music;

    private String volume;

    private String bitrate;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String playMusic() {
        return this.music.getSong();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getBitrate() {
        return bitrate;
    }

    public void setBitrate(String bitrate) {
        this.bitrate = bitrate;
    }
}
