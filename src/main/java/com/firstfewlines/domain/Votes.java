package com.firstfewlines.domain;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="votes_table", schema = "public")
public class Votes {


    @Id
    @Column(name = "votes_id", unique = true)
    @GeneratedValue (strategy = GenerationType.AUTO)
    int votesId;

    @Column(name = "num_votes")
    Integer numOfVotes;


    @ManyToOne
    @JoinTable (name = "answers_have_votes", joinColumns = {
            @JoinColumn (name = "votes_id", referencedColumnName = "votes_id")},
            inverseJoinColumns = {@JoinColumn(name="answer_id", referencedColumnName = "answer_id") } )
    private Answer answer;


    public int getVotesId() {
        return votesId;
    }

    public void setVotesId(int votesId) {
        this.votesId = votesId;
    }

    public Integer getNumOfVotes() {
        return numOfVotes;
    }

    public void setNumOfVotes(Integer numOfVotes) {
        this.numOfVotes = numOfVotes;
    }
}
