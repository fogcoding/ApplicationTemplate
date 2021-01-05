package com.fogcoding.XMLinjection;

import java.util.Map;

public class MapDemo {
    Map<String,String> maps;
    Map<String,Animal> animalMap;

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Map<String, Animal> getAnimalMap() {
        return animalMap;
    }

    public void setAnimalMap(Map<String, Animal> animalMap) {
        this.animalMap = animalMap;
    }
}
