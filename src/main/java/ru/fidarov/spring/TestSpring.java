package ru.fidarov.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.AnnotationAsyncExecutionInterceptor;

import java.util.Collections;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                PropertiesFile.class);
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext();
        CountryMusic countryMusic = con.getBean("countryMusic", CountryMusic.class);



        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.hashCode()+"="+musicPlayer1.hashCode());
        context.close();
    }
}
