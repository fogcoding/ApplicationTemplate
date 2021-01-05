package com.fogcoding.XMLinjection;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:"+name +"-- age:"+age;
    }
}
