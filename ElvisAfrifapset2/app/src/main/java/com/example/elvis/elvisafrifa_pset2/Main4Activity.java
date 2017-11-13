package com.example.elvis.elvisafrifa_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        String receivedText = intent.getStringExtra("placeholdertext");
        String receivedStory = intent.getStringExtra("storytext");


        TextView textView = (TextView) findViewById(R.id.story);
        textView.setText(receivedText);

        TextView textView2 = (TextView) findViewById(R.id.story);
        textView2.setText(receivedStory);
    }

    public void goback(View view) {
            Intent intent = new Intent(this, MainActivity.class);

            startActivity(intent);
    }
}