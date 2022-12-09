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
    public List<Music>listOfGenres;
    public MusicPlayer(List<Music> listOfGenres) {
        this.listOfGenres = listOfGenres;
    }
    //реализуем интерфейс как поле
    //IOC
    //внедряет зависимость через конструктор другой класс
    public void playMusic() {
        Random random = new Random();
        System.out.println(listOfGenres.get(random.nextInt(listOfGenres.size())).getSong());
    }
}
