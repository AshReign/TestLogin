package com.example.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startSecond(View v){
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
    }
    public void startThird(View v){
        Intent j = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(j);
    }
    public void startFourth(View v){
        Intent k = new Intent(MainActivity.this,Main4Activity.class);
        startActivity(k);
    }
}
