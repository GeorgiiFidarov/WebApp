package ru.fidarov.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.AnnotationAsyncExecutionInterceptor;

import java.util.Collections;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                PropertiesFile.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(Collections.singletonList(Genre.CLASSICAL));
        System.out.println(musicPlayer.hashCode()+"="+musicPlayer1.hashCode());
        context.close();
    }
}
