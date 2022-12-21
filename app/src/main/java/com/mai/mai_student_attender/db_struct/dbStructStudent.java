package com.mai.mai_student_attender.db_struct;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class dbStructStudent extends dbHomeStruct {
    private int idStudent;
    private String name;
    private String group;

    public dbStructStudent(Context context, int idS, String nm, String gr){
        super(context);
        idStudent = idS;
        name = nm;
        group = gr;
    }

    public String getIdStudent(String nameSt) {
        Cursor query = getReadableDatabase().query("Student",
                new String[]{"idSt"},
                "NameSt",
                new String[]{nameSt},
                null, null, null);
        String rr = query.getString(1);
        query.close();
        return rr;
    }
    public String getName(int idStud) {
        Cursor query = getReadableDatabase().query("Student",
                new String[]{"NameSt"},
                "idSt",
                new String[]{},
                null, null, null);
        String rr = query.getString(2);
        query.close();
        return rr;
    }
    public String getGroup(int idStud) {
        Cursor query = getReadableDatabase().query("Student",
                new String[]{"GroupSt"},
                "idSt",
                new String[]{String.valueOf(idStud)},
                null, null, null);
        String rr = query.getString(3);
        query.close();
        return rr;
    }
    public Cursor getStudentT(int idS) {
        Cursor query = getReadableDatabase().query("Student",
                null, null, null, null, null, null);
        return query;
    }

    public void addStudent(int idS, String nameS, String groupS) {
        ContentValues cv = new ContentValues();
        idStudent = idS;
        cv.put("NameSt", nameS);
        name = nameS;
        cv.put("GroupSt", groupS);
        group = groupS;
        getWritableDatabase().insertOrThrow("Students",
                null, cv);
    }
    public Cursor getByGroup(String gr) {
        Cursor qqq = getReadableDatabase().query("Student",
                new String[]{"idSt", "NameSt"},
                "GroupSt",
                new String[]{gr}, null, null, null);
        return qqq;
//        SELECT "idSt", "NameSt"
//        FROM "Student"
//        WHERE "GroupSt"="М4О-306Б-20";
    }

    public void delStudent(int idS) {
        getWritableDatabase().delete("Student",
                "idSt", new String[]{String.valueOf(idS)});
    }

    public void dbClear() {
        getWritableDatabase().delete("Student",
                null, null);
    }

//    public int getIdStudent(){return idStudent;}
//    public String getName(){return name;}
//    public String getGroup(){return group;}
//    public void setIdStudent(int id){idStudent = id;}
//    public void setName(String nameS){name = nameS;}
//    public void setGroup(String groupS){group = groupS;}
}
