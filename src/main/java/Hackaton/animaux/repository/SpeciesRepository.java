package Hackaton.animaux.repository;

import Hackaton.animaux.model.Species;

import java.util.ArrayList;
import java.util.List;

public class SpeciesRepository {
    private final List<Species> speciesList = new ArrayList<>();

    public SpeciesRepository() {
        speciesList.add(new Species("carnivore", "d'Afrique"));
        speciesList.add(new Species("herbivore", "d'Afrique"));
        speciesList.add(new Species("omnivore", "d'Asie"));
        speciesList.add(new Species("carnivore, il mange du poisson", "d'Amérique du Sud"));
    }

    public List<Species> findAll() { return speciesList; }
}
