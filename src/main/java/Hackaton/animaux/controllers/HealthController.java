package Hackaton.animaux.controllers;

import Hackaton.animaux.models.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {
    private final HealthService service;

    public HealthController(HealthService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public Map<String, String> health(@RequestParam(required = false) String name) {
        if (name == null) {
            return Map.of("statute", "ok");
        } else {
            return Map.of("statute", service.status(name));
        }
    }

}
