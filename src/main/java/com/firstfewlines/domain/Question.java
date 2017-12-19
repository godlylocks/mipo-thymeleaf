package com.firstfewlines.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="question_table", schema = "public")
public class Question {


    @Id
    @Column(name = "question_id", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int questionId;

    @Column (name = "question_text")
    String questionText;

    @ManyToOne
    @JoinTable (name = "organism_has_question", joinColumns = {
            @JoinColumn (name = "question_id", referencedColumnName = "question_id")},
            inverseJoinColumns = {@JoinColumn(name="organism_id", referencedColumnName = "organism_id") } )
    private Organism organism;


    @OneToMany
    @JoinTable (name = "question_has_answers", joinColumns = {
            @JoinColumn (name = "question_id", referencedColumnName = "question_id")},
            inverseJoinColumns = {@JoinColumn(name="answer_id", referencedColumnName = "answer_id") } )
    private Collection<Answer> answers = new ArrayList<>();


    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return questionText;
    }

    public void setQuestion(String question) {
        this.questionText = question;
    }
}
