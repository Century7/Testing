package com.example.budget.controller;

import com.example.budget.dao.Apiresponse;
import com.example.budget.entity.AssistantLocation;
import com.example.budget.service.AssistantLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/assistantLocation")
@RequiredArgsConstructor
public class AssistantLocationController {

    final AssistantLocationService assistantLocationService;

    @GetMapping("/all")
    public Apiresponse getAllAssistantLocation() {
        return assistantLocationService.getAll();
    }

    @GetMapping("/{postal_code}")
    public Apiresponse getOne(@PathVariable String postal_code) {
        return assistantLocationService.getOne(postal_code);
    }

    @PostMapping
    public Apiresponse addAssistantLocation(@RequestBody AssistantLocation assistantLocation) {
        return assistantLocationService.addAssistantLocation(assistantLocation);
    }

    @PutMapping("/{postal_code}")
    public Apiresponse editAssistantLocation(@PathVariable String postal_code, @RequestBody AssistantLocation assistantLocation) {
        return assistantLocationService.editAssistantLocation(postal_code, assistantLocation);
    }

    @DeleteMapping("/{postal_code}")
    public Apiresponse deletAssistantLocation(@PathVariable String postal_code) {
        return assistantLocationService.delete(postal_code);
    }
}
