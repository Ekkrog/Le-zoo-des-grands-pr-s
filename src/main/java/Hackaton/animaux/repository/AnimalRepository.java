package Hackaton.animaux.repository;

import Hackaton.animaux.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {
    private final List<Animal> animaux = new ArrayList<>();

    public AnimalRepository() {
        animaux.add(new Animal(1L, "NOM_1", "ESPECE_1", "GARDIEN_1", List.of("NOURRITURE_1A", "NOURRITURE_1B")));
        animaux.add(new Animal(2L, "NOM_2", "ESPECE_2", "GARDIEN_2", List.of("NOURRITURE_2A")));
    }

    public List<Animal> findAll() {
        return animaux;
    }
}