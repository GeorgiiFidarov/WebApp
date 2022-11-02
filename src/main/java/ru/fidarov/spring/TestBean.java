package ru.fidarov.spring;

public class TestBean { //Bean и объект это одинаковое
    private String name;
    public TestBean(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
