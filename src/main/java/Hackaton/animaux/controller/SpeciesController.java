package Hackaton.animaux.controller;

import Hackaton.animaux.model.Species;
import Hackaton.animaux.service.SpeciesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SpeciesController {
    private final SpeciesService service;

    public SpeciesController(SpeciesService service) {
        this.service = service;
    }

    @GetMapping("/species")
    public ResponseEntity<?> getSpecies(@RequestParam(required = false) String name) {
        List<Species> result = service.findAll(name);
        if (result.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Aucune espece trouvee pour le nom : " + name));
        }
        return ResponseEntity.ok(result);
    }
}
