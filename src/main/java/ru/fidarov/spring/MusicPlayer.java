package ru.fidarov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

/**
 * Здравствуйте, заинтересован в вашей вакансии „Backend программист (SPRING)“.
 * Spring учил сам, выучился в основном на прошлом месте работы,
 * с помощью внутренних корпоративных курсов и наставничеству от коллег.
 * На данный момент понимая базовые принципы учусь по книгам, изучаю алгоритмы, новые паттерны проектирования.
 * Мне нравится то что я делаю и мой путь постоянного совершенствования.
 * Дополнительно понимаю процесс разработки и выхода в промышленную среду
 * благодаря опыту работы в качестве "инженера по сопровождению".
 * Мой контактный телефон 89670666800. Просьба связываться по Telegramm/WhatsApp
 * С уважением, Георгий
 */


//создать бин из этого класса
public class MusicPlayer{
    public List<ClassicalMusic>listOfGenres;
    public MusicPlayer(List<ClassicalMusic> listOfGenres) {
        this.listOfGenres = listOfGenres;
    }
    //реализуем интерфейс как поле
    //IOC
    //внедряет зависимость через конструктор другой класс
    public void playMusic(List<Genre> listOfGenres) {
        Random random = new Random();
        RockMusic rockMusic = new RockMusic();
        Genre g = listOfGenres.get(random.nextInt(listOfGenres.size()));
        if (g == Genre.RAP){
            System.out.println(rockMusic.getSong());
        }
//        switch(g){
//            case ROCK:
//                System.out.println(RockMusic.getSong()+" ");
//                break;
//            case RAP:
//                System.out.println(RapMusic.getSong()+" ");
//                break;
//            case CLASSICAL:
//                System.out.println(ClassicalMusic.getSong()+" ");
//                break;
//        }
    }
    public List<Genre> getListOfGenres() {
        return listOfGenres;
    }
}
