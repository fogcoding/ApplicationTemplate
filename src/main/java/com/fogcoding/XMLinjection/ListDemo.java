package com.fogcoding.XMLinjection;

import java.util.List;

public class ListDemo {
    List<String> strs;
    List<Animal> animals;

    public List<String> getStrs() {
        return strs;
    }

    public void setStrs(List<String> strs) {
        this.strs = strs;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
