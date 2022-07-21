package com.example.budget.service;

import com.example.budget.dao.Apiresponse;
import com.example.budget.entity.Answer;
import com.example.budget.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class AnswerService {
    final AnswerRepository answerRepository;

    public Apiresponse getAll() {
        List<Answer> answerList = answerRepository.findAll();
        return new Apiresponse("All answer", true, answerList);
    }

    public Apiresponse getOne(Integer id) {
        Optional<Answer> answerOptional = answerRepository.findById(id);
        return answerOptional.map(answer -> new Apiresponse("This answer", true, answer)).orElseGet(() ->
                new Apiresponse("There is no answer with this id", false));
    }

    public Apiresponse addAnswer(Answer answer) {
        Answer save = answerRepository.save(answer);
        return new Apiresponse("Succesfully added", true, save);
    }

    public Apiresponse editAnswer(Integer id, Answer answer) {
        Optional<Answer> byId = answerRepository.findById(id);
        if (byId.isPresent()) {
            Answer answer1 = byId.get();
            answer1.setDate(answer.getDate());
            answer1.setDescription(answer.getDescription());
            answer1.setTitle(answer.getTitle());
            answer1.setQuestion_id(answer.getQuestion_id());
            answer1.setUser_id(answer.getUser_id());
            answerRepository.save(answer1);
            return new Apiresponse("This answer succcesfully edited", true);
        }
        return new Apiresponse("There is no answer with this id", false);
    }

    public Apiresponse delete(Integer id) {
        answerRepository.deleteById(id);
        return new Apiresponse("This answer succesfully deleted", true);
    }
}
