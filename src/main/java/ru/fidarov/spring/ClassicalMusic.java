package ru.fidarov.spring;

import org.springframework.stereotype.Component;
//делает так, чтобы это было компонентом, то есть создаст бин этого класса
@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Chelkunchik";
    }
}
