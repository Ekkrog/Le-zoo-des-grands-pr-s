package Hackaton.animaux.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public String status(String name) { return "ok" + name; }
}
