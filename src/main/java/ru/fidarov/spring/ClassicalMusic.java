package ru.fidarov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;
//делает так, чтобы это было компонентом, то есть создаст бин этого класса
@Component
public class ClassicalMusic implements Music{
    private List<String> classicSongs = new ArrayList<>(asList("Chelkunchik", "Swan Lake","Bach Symphony"));

    @Override
    public String getSong() {
        Random random = new Random();
        return classicSongs.get(random.nextInt(classicSongs.size()));
    }
    @Override
    public String toString() {
        return classicSongs+" ";
    }
}
