package com.firstfewlines.domain;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="user_table", schema = "public")
public class User {

    @Transient
    static final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int rollNo;
    String name;
    String stream;
    Date dateOfBirth;
    int totalMarks;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Transient
    public String getDateOfBirthFormatted() {
        return df.format(dateOfBirth);
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}
