package Hackaton.animaux.repository;

import Hackaton.animaux.model.Species;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SpeciesRepository {
    private final List<Species> speciesList = new ArrayList<>();

    public SpeciesRepository() {
        speciesList.add(new Species("Lion","carnivore", "Afrique"));
        speciesList.add(new Species("Girafe","herbivore", "Afrique"));
        speciesList.add(new Species("Panda roux","omnivore", "Asie"));
        speciesList.add(new Species("Manchot de Humboldt","carnivore, il mange du poisson", "Amerique du Sud"));
    }

    public List<Species> findAll() { return speciesList; }
}
