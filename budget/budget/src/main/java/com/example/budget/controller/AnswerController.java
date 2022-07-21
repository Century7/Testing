package com.example.budget.controller;

import com.example.budget.dao.Apiresponse;
import com.example.budget.entity.Answer;
import com.example.budget.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {

    final AnswerService answerService;

    @GetMapping("/all")
    public Apiresponse getAllAnswer() {
        return answerService.getAll();
    }

    @GetMapping("/{id}")
    public Apiresponse getOne(@PathVariable Integer id) {
        return answerService.getOne(id);
    }

    @PostMapping
    public Apiresponse addAnswer(@RequestBody Answer answer) {
        return answerService.addAnswer(answer);
    }

    @PutMapping("/{id}")
    public Apiresponse editAnswer(@PathVariable Integer id, @RequestBody Answer answer) {
        return answerService.editAnswer(id, answer);
    }

    @DeleteMapping("/{id}")
    public Apiresponse deletAnswer(@PathVariable Integer id) {
        return answerService.delete(id);
    }
}
