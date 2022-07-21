package com.example.budget.service;

import com.example.budget.dao.Apiresponse;
import com.example.budget.entity.AskQuestion;
import com.example.budget.repository.AskQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AskQuestionService {
    final AskQuestionRepository askQuestionRepository;


    public Apiresponse getAll() {
        List<AskQuestion> askQuestionList = askQuestionRepository.findAll();
        return new Apiresponse("All askQuestion", true, askQuestionList);
    }

    public Apiresponse getOne(Integer id) {
        Optional<AskQuestion> askQuestionOptional = askQuestionRepository.findById(id);
        return askQuestionOptional.map(askQuestion -> new Apiresponse("This askQuestion", true, askQuestion)).orElseGet(() ->
                new Apiresponse("There is no askQuestion with this id", false));
    }

    public Apiresponse addAskQuestion(AskQuestion askQuestion) {
        AskQuestion save = askQuestionRepository.save(askQuestion);
        return new Apiresponse("Succesfully added", true, save);
    }

    public Apiresponse editAskQuestion(Integer id, AskQuestion askQuestion) {
        Optional<AskQuestion> byId = askQuestionRepository.findById(id);
        if (byId.isPresent()) {
            AskQuestion askQuestion1 = byId.get();
            askQuestion1.setDate(askQuestion.getDate());
            askQuestion1.setDescription(askQuestion.getDescription());
            askQuestion1.setTitle(askQuestion.getTitle());
            askQuestion1.setQuestion_id(askQuestion.getQuestion_id());
            askQuestion1.setUser_id(askQuestion.getUser_id());
            askQuestionRepository.save(askQuestion1);
            return new Apiresponse("This askQuestion succcesfully edited", true);
        }
        return new Apiresponse("There is no askQuestion with this id", false);
    }

    public Apiresponse delete(Integer id) {
        askQuestionRepository.deleteById(id);
        return new Apiresponse("This askQuestion succesfully deleted", true);
    }
}
