package com.mai.mai_student_attender.db_struct;

public class dbStructDiscipline {
    private int idDiscipline;
    private String name;
    private String group;

    public dbStructDiscipline(int idD, String nm, String gr){
        idDiscipline = idD;
        name = nm;
        group = gr;
    }

    public int getIdDiscipline() {return idDiscipline;}

    public String getName(){return name;}

    public String getGroup(){return group;}

}
