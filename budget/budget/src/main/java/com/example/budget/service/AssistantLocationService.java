package com.example.budget.service;

import com.example.budget.dao.Apiresponse;
import com.example.budget.entity.AssistantLocation;
import com.example.budget.repository.AssistantLocationRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class AssistantLocationService {
    final AssistantLocationRepository assistantLocationRepository;

    public Apiresponse getAll() {
        List<AssistantLocation> assistantLocationList = assistantLocationRepository.findAll();
        return new Apiresponse("All assistantLocation", true, assistantLocationList);
    }

    public Apiresponse getOne(String postalCode) {
        Optional<AssistantLocation> assistantLocationOptional = assistantLocationRepository.findById(postalCode);
        return assistantLocationOptional.map(assistantLocation -> new Apiresponse("This assistantLocation", true, assistantLocation)).orElseGet(() ->
                new Apiresponse("There is no assistantLocation with this postalCode", false));
    }

    public Apiresponse addAssistantLocation(AssistantLocation assistantLocation) {
        AssistantLocation save = assistantLocationRepository.save(assistantLocation);
        return new Apiresponse("Succesfully added", true, save);
    }

    public Apiresponse editAssistantLocation(String postalCode, AssistantLocation assistantLocation) {
        Optional<AssistantLocation> byId = assistantLocationRepository.findById(postalCode);
        if (byId.isPresent()) {
            AssistantLocation assistantLocation1 = byId.get();

            assistantLocationRepository.save(assistantLocation1);
            return new Apiresponse("This assistantLocation succcesfully edited", true);
        }
        return new Apiresponse("There is no assistantLocation with this postalCode", false);
    }

    public Apiresponse delete(String postalCode) {
        assistantLocationRepository.deleteById(postalCode);
        return new Apiresponse("This assistantLocation succesfully deleted", true);
    }
}
