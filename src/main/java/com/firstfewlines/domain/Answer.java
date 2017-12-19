package com.firstfewlines.domain;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="answer_table", schema = "public")
public class Answer {


    @Id
    @Column(name = "answer_id", unique = true)
    @GeneratedValue (strategy = GenerationType.AUTO)
   int answerId;

    @Column(name = "answer_text")
   String answer;


    @ManyToOne
    @JoinTable (name = "question_has_answers", joinColumns = {
            @JoinColumn (name = "answer_id", referencedColumnName = "answer_id")},
            inverseJoinColumns = {@JoinColumn(name="question_id", referencedColumnName = "question_id") } )
    private Question question;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
