
package Hackaton.animaux.repository;

import Hackaton.animaux.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {

    private final List<Animal> animaux = new ArrayList<>();

    public AnimalRepository() {

        animaux.add(new Animal("Nala", 8, "Lion",
                List.of("Pesée", "Soin des dents", "Enrichissement")));

        animaux.add(new Animal("Kibo", 10, "Lion",
                List.of("Pesée", "Soin des dents")));

        animaux.add(new Animal("Zuri", 6, "Girafe",
                List.of("Pesée", "Soin des sabots", "Enrichissement")));

        animaux.add(new Animal("Pépite", 4, "Panda roux",
                List.of("Pesée", "Brossage", "Enrichissement")));

        animaux.add(new Animal("Pablo", 3, "Manchot de Humboldt",
                List.of("Pesée", "Vaccination")));

        animaux.add(new Animal("Chips", 5, "Manchot de Humboldt",
                List.of("Pesée", "Vaccination")));
    }

    public List<Animal> findAll() {
        return animaux;
    }
    public void create(Animal animal) {
        animaux.add(animal);
    }
}
