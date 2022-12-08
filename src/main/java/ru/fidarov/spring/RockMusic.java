package ru.fidarov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class RockMusic implements Music{
    private List<String> rockSongs = new ArrayList<>(asList(
            "Master of Puppets",
            "Symphony of distraction",
            "Numb"));
    @Override
    public String getSong() {
        Random random = new Random();
        return rockSongs.get(random.nextInt(rockSongs.size()));
    }
    @Override
    public String toString() {
        return rockSongs+"";
    }
}
