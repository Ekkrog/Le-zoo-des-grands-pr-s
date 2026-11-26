package Hackaton.animaux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping("/animals")
    public List<Animal> findAll(@RequestParam(required = false) String name) {
        if (name != null) {
            return service.findByName(name);
        }
        return service.findAll();
    }
}
