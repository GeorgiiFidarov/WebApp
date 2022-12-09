package ru.fidarov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;
 //создаёт нам наш бин.
public class RapMusic implements Music {
    private List<String> rapSongs = new ArrayList<>(asList("Rap God", "Good day","Big poopa"));
    @Override
    public String getSong() {
        Random random = new Random();
        return rapSongs.get(random.nextInt(rapSongs.size()));
    }
    @Override
    public String toString() {
        return rapSongs+""+getClass();
    }
}
