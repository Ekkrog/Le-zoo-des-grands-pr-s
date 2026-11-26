package Hackaton.animaux.service;

import Hackaton.animaux.model.Animal;
import Hackaton.animaux.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Le métier : ce qu'on cherche parmi les animaux. Ni HTTP ni JSON ici.
@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    // Les animaux dont le nom contient le texte cherché, sans tenir compte des majuscules.
    public List<Animal> findByName(String name) {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animalRepository.findAll()) {
            if (animal.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(animal);
            }
        }
        return result;
    }

    public void create(Animal animal) {
        animalRepository.create(animal);
    }
}
