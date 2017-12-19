package com.firstfewlines.domain;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


@Entity
@Table(name="organism_table", schema = "public")
public class Organism {

    @Id
    @Column (name="organism_id", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int organismID;

    @Column (name="organism_name")
    String organismName;

    @OneToMany
    @JoinTable (name = "organism_has_question", joinColumns = {
            @JoinColumn (name = "organism_id", referencedColumnName = "organism_id")},
            inverseJoinColumns = {@JoinColumn(name="question_id", referencedColumnName = "question_id") } )
    private Collection<Question> questions = new ArrayList<>();


    public int getOrganismID() {
        return organismID;
    }

    public void setOrganismID(int organismID) {
        this.organismID = organismID;
    }

    public String getOrganismName() {
        return organismName;
    }

    public void setOrganismName(String organismName) {
        this.organismName = organismName;
    }
}
