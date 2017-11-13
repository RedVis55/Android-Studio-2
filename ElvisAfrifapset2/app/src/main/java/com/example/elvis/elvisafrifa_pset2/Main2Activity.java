package com.example.elvis.elvisafrifa_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goToStory (View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);

    }
}
