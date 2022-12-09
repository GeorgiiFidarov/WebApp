package ru.fidarov.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.fidarov.spring")
@PropertySource("classpath:musicPlayer.properties")
public class PropertiesFile {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }
    @Bean
    public List<Music>ListOfGenres(){
        return Arrays.asList(rapMusic(),classicalMusic(),rockMusic());
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(ListOfGenres());
    }
}
