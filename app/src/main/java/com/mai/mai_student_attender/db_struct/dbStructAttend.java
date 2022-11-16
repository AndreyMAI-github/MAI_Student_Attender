package com.mai.mai_student_attender.db_struct;

public class dbStructAttend {
    private int idAttend;
    private int idStudent;
    private int idLesson;
    private boolean flag;

    public  dbStructAttend(int idA, int idS, int idL, boolean f) {
        idAttend = idA;
        idStudent = idS;
        idLesson = idL;
        flag = f;
    }

    public int getIdAttend(){return idAttend;}

    public int getIdStudent(){return idStudent;}

    public int getIdLesson(){return idLesson;}

    public boolean isFlag(){return flag;}
}
