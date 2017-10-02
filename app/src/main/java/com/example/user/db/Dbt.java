package com.example.user.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.HashMap;

/**
 * Created by user on 25-09-2017.
 */

public class Dbt extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "TEST1.db";
    public static final String QUESTION_TYPE_TABLE = "QUESTION_TYPE_TABLE";
    public static final String QUESTION_TYPE_ID = "QUESTION_TYPE_ID";
    public static final String QUESTION_TYPE_DESCRIPTION = "QUESTION_TYPE_DESCRIPTION";
    public static final String TOPIC_TABLE = "TOPIC_TABLE";
    public static final String TOPIC_ID = "TOPIC_ID";
    public static final String TOPIC_NAME = "TOPIC_NAME";
    public static final String TOPIC_DESCRIPTION = "TOPIC_DESCRIPTION";
    private HashMap hp;

    public Dbt(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + QUESTION_TYPE_TABLE + "(QUESTION_TYPE_ID INTEGER PRIMARY KEY AUTOINCREMENT, QUESTION_TYPE_DESCRIPTION TEXT)");
        db.execSQL("create table " + TOPIC_TABLE + "(TOPIC_ID integer primary key, TOPIC_NAME text, TOPIC_DESCRIPTION text )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+QUESTION_TYPE_TABLE);
        db.execSQL("DROP TABLE IF EXISTS "+TOPIC_TABLE);
        onCreate(db);
    }

    public boolean insertUser(int id, String surname) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("QUESTION_TYPE_ID", id);
        contentValues.put("QUESTION_TYPE_DESCRIPTION", surname);
        db.insert(QUESTION_TYPE_TABLE, null, contentValues);
        return true;
    }
    public boolean inserttopic(int id,String topicname,String desc)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("TOPIC_ID",id);
        contentValues.put("TOPIC_NAME",topicname);
        contentValues.put("TOPIC_DESCRIPTION",desc);
        db.insert("TOPIC_TABLE", null, contentValues);
        return true;
    }
}
