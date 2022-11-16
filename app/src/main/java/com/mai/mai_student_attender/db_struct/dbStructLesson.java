package com.mai.mai_student_attender.db_struct;

import java.sql.Date;
import java.sql.Time;

enum WorkType{
    LECTURE,
    PRACTISE,
    LAB,
}

public class dbStructLesson {
    private int idLesson;
    private int idDiscipline;
    private WorkType type;
    private Time time;
    private Date date;

    public int getIdLesson(){return idLesson;}

    public int getIdDiscipline(){return idDiscipline;}

    public WorkType getType(){return type;}

    public Time getTime(){return time;}

    public Date getDate(){return date;}
}
