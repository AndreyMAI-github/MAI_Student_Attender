package com.mai.mai_student_attender.db_struct;

import android.content.Context;
import android.database.Cursor;

public class dbStructDiscipline extends dbHomeStruct{
    private int idDiscipline;
    private String name;
    private String group;

    public dbStructDiscipline(Context context, int idD, String nm, String gr){
        super(context);
        idDiscipline = idD;
        name = nm;
        group = gr;
    }

    public Cursor getTimetable(int dd, int mm, int yy) {
        int dataOfQ = dd*10000+mm*100+yy;
        Cursor qqq;
        String table = "Lesson as le inner join Discipline as di on di.idDisc = le.idDi";
        String[] columns = {"di.NameDisc", "di.ConGroup", "le.Type", "le.DateL", "le.TimeL"};
        String selection = "le.DateL = ?";
        String[] selectionArgs = {String.valueOf(dataOfQ)};
        qqq = getReadableDatabase().query(
                table,
                columns,
                selection,
                selectionArgs,
                null, null, null);
        return qqq;
    }

    public int getIdDiscipline() {return idDiscipline;}

    public String getName(){return name;}

    public String getGroup(){return group;}

}
