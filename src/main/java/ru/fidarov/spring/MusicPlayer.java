package ru.fidarov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component//создать бин из этого класса
public class MusicPlayer{
    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;
    private RockMusic rockMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }
    //реализуем интерфейс как поле
    //IOC
    //внедряет зависимость через конструктор другой класс
    public void playMusic(Genre genre) {
        switch(genre){
            case ROCK:
                System.out.println(rockMusic.getSong());
                break;
            case RAP:
                System.out.println(rapMusic.getSong());
                break;
            case CLASSICAL:
                System.out.println(classicalMusic.getSong());
                break;
        }
    }


}
