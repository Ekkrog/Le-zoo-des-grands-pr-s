package Hackaton.animaux.model;

import java.util.List;

public class Animal {

    private String name;
    private int age;
    private String species;
    private List<String> cares;

    public Animal(String name, int age, String species, List<String> cares) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.cares = cares;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public List<String> getCares() {
        return cares;
    }
}