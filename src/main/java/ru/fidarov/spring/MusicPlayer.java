package ru.fidarov.spring;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer{
    ;
    private List<Music> musicList = new ArrayList<>();
    //private Music music; // реализуем интерфейс как поле
    //IOC
    public MusicPlayer(List<Music> musicList){ //конструктор на интерфейсе
        this.musicList = musicList;
    }
    public MusicPlayer(){
    }
    public void setMusicList(List<Music> musicList) { //
        this.musicList = musicList;
    }
    //теперь MusicPlayer имеет все приколы от интерфейса+свои
    public void playMusic(){
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
