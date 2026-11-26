package Hackaton.animaux.controller;

import Hackaton.animaux.model.Animal;
import Hackaton.animaux.service.AnimalService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AnimalController {
    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping("/animals")
    public ResponseEntity<Object> findAll(@RequestParam(required = false) String name) {
        if (name != null) {
            List<Animal> result = service.findByName(name);

            if (result.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(Map.of("error", "Aucun animal ne correspond à votre recherche"));
            } else {
                return ResponseEntity.ok(result);
            }
        }
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/animals")
    public ResponseEntity<Animal> create(@RequestBody Animal animaux) {
        service.create(animaux);
        return ResponseEntity.status(HttpStatus.CREATED).body(animaux);
    }
}
