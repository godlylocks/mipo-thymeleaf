package com.firstfewlines.controller;

import com.firstfewlines.domain.Question;
import com.firstfewlines.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Cody_OPI on 12/18/17.
 */
@RequestMapping(value = "/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @RequestMapping
    public String questions() {
        return "questions";
    }

    @RequestMapping(value = "questions", consumes = MediaType.ALL_VALUE)
    public ModelAndView renderQuestions(@RequestParam Integer id) {

        System.out.println("Question Id: [" + id + "]");


        ModelAndView modelAndView = new ModelAndView("contribute");

        if (id != null && this.questionService.getQuestions(id) != null) {
            List<Question> questionList = (List<Question>) questionService.getQuestions(id);

            if (questionList != null && questionList.size() > 0) {
                modelAndView.addObject("questions", questionList);
            }
        } else {
            modelAndView.addObject("default", new String("No Questions for this Organism"));

        }

        return modelAndView;
    }


}
