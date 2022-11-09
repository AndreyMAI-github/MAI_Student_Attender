package com.mai.mai_student_attender;

import android.util.Log;

public class Logger{

    public static String getTag(String level) {
        String tag = "";
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for (int i = 0; i < ste.length; i++) {
            if (ste[i].getMethodName().equals(level)) {
                tag = "("+ste[i + 1].getFileName() + ":" + ste[i + 1].getLineNumber()+")";
            }
        }
        return tag;
    }

    public static void d(String message) {
        if(BuildConfig.BUILD_TYPE == "debug") {
            Log.d(getTag("d"), message);
        }
    }

    public static void i(String tag, String message) {
        if(BuildConfig.BUILD_TYPE == "debug") {
            Log.i(getTag("i"), message);
        }
    }

    public static void e(String tag, String message) {
        if(BuildConfig.BUILD_TYPE == "debug") {
            Log.e(getTag("e"), message);
        }
    }

    public static void w(String tag, String message) {
        if(BuildConfig.BUILD_TYPE == "debug") {
            Log.w(getTag("e"), message);
        }
    }

    public static void wtf(String tag, String message) {
        if(BuildConfig.BUILD_TYPE == "debug") {
            Log.wtf(getTag("wtf"), message);
        }
    }
}

