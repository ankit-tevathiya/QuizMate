package com.delaroystudios.sqlitelogin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.delaroystudios.sqlitelogin.QuestionBankJava;
import com.delaroystudios.sqlitelogin.Quiz1;
import com.delaroystudios.sqlitelogin.QuizActivity;
import com.delaroystudios.sqlitelogin.QuizActivityJava;
import com.delaroystudios.sqlitelogin.R;

/**
 * Created by delaroy on 3/27/17.
 */
public class UsersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);


    }
    public void btn(View v){
        Intent i=new Intent(this, QuizActivity.class);
        startActivity(i);
    }
    public void javabtn(View v){
        Intent i=new Intent(this, Quiz1.class);
        startActivity(i);
    }
}
