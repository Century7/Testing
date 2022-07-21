package com.example.budget.controller;

import com.example.budget.dao.Apiresponse;
import com.example.budget.entity.AskQuestion;
import com.example.budget.service.AskQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/askQuestion")
@RequiredArgsConstructor
public class AskQuestionController {

    final AskQuestionService askQuestionService;

    @GetMapping("/all")
    public Apiresponse getAllAskQuestion() {
        return askQuestionService.getAll();
    }

    @GetMapping("/{id}")
    public Apiresponse getOne(@PathVariable Integer id) {
        return askQuestionService.getOne(id);
    }

    @PostMapping
    public Apiresponse addAskQuestion(@RequestBody AskQuestion askQuestion) {
        return askQuestionService.addAskQuestion(askQuestion);
    }

    @PutMapping("/{id}")
    public Apiresponse editAskQuestion(@PathVariable Integer id, @RequestBody AskQuestion askQuestion) {
        return askQuestionService.editAskQuestion(id, askQuestion);
    }

    @DeleteMapping("/{id}")
    public Apiresponse deletAskQuestion(@PathVariable Integer id) {
        return askQuestionService.delete(id);
    }
}
