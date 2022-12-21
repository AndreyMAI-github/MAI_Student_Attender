package com.mai.mai_student_attender.db_struct;

import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class dbHomeStruct extends SQLiteOpenHelper {
    private String DB_PATH; // полный путь к базе данных
    private static String DB_NAME = "dataSbase.db";
    private static int SCHEMA = 1; // версия базы данных

    private Context myContext;

    dbHomeStruct(Context context) {
        super(context, DB_NAME, null, SCHEMA);
        this.myContext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {}

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {}
}