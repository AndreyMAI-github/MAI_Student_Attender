package com.mai.mai_student_attender.panel_elements.home;

public class Unit {

    //private int number; // ресурс номера пары
    private String discipline; // дисциплина
    private String time;  // время
    private String type;  // лк/пз


    public Unit(String discipline, String time, String type){  //+ int number
        //this.number = number;
        this.discipline = discipline;
        this.time = time;
        this.type = type;


    }

   // public int getNumber() {
       // return number;}

   // public void setNumber(int number) {
       // this.number = number;}

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType(){
        return type;
    }

    public void setType(){
        this.type = type;
    }
}