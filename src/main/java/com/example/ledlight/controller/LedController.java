package com.example.ledlight.controller;

import com.example.ledlight.entity.Led;
import com.example.ledlight.repository.LedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/led")
public class LedController {
    @Autowired
    private LedRepository ledRepository;

    @GetMapping
    public List<Led> getLed(){
        return ledRepository.findAll();
    }

    @PostMapping
    public List<Led> createLed(@RequestBody Led led){
        ledRepository.save(led);
        return ledRepository.findAll();
    }

    @PutMapping("/{id}")
    public List<Led> editLed(@PathVariable Long id,@RequestBody Led editedLed){
        Optional<Led> optionalLed = ledRepository.findById(id);
        Led led = optionalLed.get();
        led.setNumLed(editedLed.getNumLed());
        led.setStatus(editedLed.getStatus());
        ledRepository.save(led);
        return ledRepository.findAll();
    }
}
