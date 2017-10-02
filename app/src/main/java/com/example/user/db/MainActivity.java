package com.example.user.db;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dbt db = new Dbt(this);
        db.getWritableDatabase();
        db.insertUser(1,"Multiple Choice ");
        db.insertUser(2,"True or False ");
        db.insertUser(3," Fill in the blank  ");
        db.insertUser(4,"Multi Select ");
        db.inserttopic(1,"Aptitude","Speed Time & Distance ");
        db.inserttopic(2,"Reasoning","Blood Relations");
        db.inserttopic(2,"Reasoning","Blood Relations");
    }
}
