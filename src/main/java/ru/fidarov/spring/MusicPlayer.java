package ru.fidarov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

@Component//создать бин из этого класса
public class MusicPlayer{
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic,RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }
    private Music music;//реализуем интерфейс как поле
    //IOC
    //внедряет зависимость через конструктор другой класс
    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
        System.out.println("Playing: " + rapMusic.getSong());
    }
}
