package Hackaton.animaux.service;

import Hackaton.animaux.model.Species;
import Hackaton.animaux.repository.SpeciesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeciesService {
    private final SpeciesRepository repository;

    public SpeciesService(SpeciesRepository repository) {
        this.repository = repository;
    }

    public List<Species> findAll(String name) {
        if (name == null || name.isBlank()) {
            return repository.findAll();
        }
        String search = name.toLowerCase();
        return repository.findAll().stream()
                .filter(species -> species.getName().toLowerCase().contains(search))
                .toList();
    }
}
