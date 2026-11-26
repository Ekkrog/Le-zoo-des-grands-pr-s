package Hackaton.animaux.model;

public class Species {
    private final String name;
    private final String diet;
    private final String origin;

    public Species(String name,String diet, String origin) {
        this.name = name;
        this.diet = diet;
        this.origin = origin;
    }

    public String getName() { return name; }
    public String getDiet() { return diet; }
    public String getOrigin() { return origin; }
}
