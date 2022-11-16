package com.mai.mai_student_attender.db_struct;

public class dbStructStudent {
    private int idStudent;
    private String name;
    private String group;

    public dbStructStudent(int idS, String nm, String gr){
        idStudent = idS;
        name = nm;
        group = gr;
    }

    public int getIdStudent(){return idStudent;}
    public String getName(){return name;}
    public String getGroup(){return group;}
}
