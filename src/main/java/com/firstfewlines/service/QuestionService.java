package com.firstfewlines.service;

import com.firstfewlines.domain.Question;
import com.firstfewlines.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Cody_OPI on 12/18/17.
 */
@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public Iterable<Question> getQuestions(Integer id){
        System.out.println ("+++++++" + questionRepository.findByQuestionId(id));
        return questionRepository.findByQuestionId(id);
    }
}
