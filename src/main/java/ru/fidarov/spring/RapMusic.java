package ru.fidarov.spring;

import org.springframework.stereotype.Component;

@Component //создаёт нам наш бин.
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap God";
    }
}
