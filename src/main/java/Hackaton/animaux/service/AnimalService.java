package Hackaton.animaux.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

// Le métier : ce qu'on cherche parmi les animaux. Ni HTTP ni JSON ici.
@Service
public class AnimalService {
    private final AnimalRepository animalRepository;
    private final AnimalService animalService;

    public AnimalService(AnimalService animalService) {
        this.animalRepository = animalRepository;
        this.animalService = animalService;
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
}
