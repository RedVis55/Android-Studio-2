package com.example.elvis.elvisafrifa_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.example.elvis.elvisafrifa_pset2.Story.*;

public class Main3Activity extends AppCompatActivity {

    Story MyStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String[] Stories = {"madlib0_simple.txt", "madlib1_tarzan.txt", "madlib2_university.txt", "madlib3_clothes.txt",
                "madlib4_dance.txt"};
        int strings = new Random().nextInt(Stories.length);
        String random = (Stories[strings]);

        if (MyStory == null) {
            ;
            try {
                MyStory = new Story(getAssets().open(random));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Log.d("vind", MyStory.toString());
        }

        TextView placeholderremaining2 = (TextView)findViewById(R.id.placeholderRemaining);
        placeholderremaining2.setText(MyStory.getPlaceholderRemainingCount()+"word(s) left"  );

    }





        public void goToStori(View view) {
            EditText placeput = (EditText) findViewById(R.id.editplace);
            String placeholders = (String) placeput.getText().toString();

            Intent intent = new Intent(this, Main4Activity.class);

            MyStory.fillInPlaceholder(placeholders);
            intent.putExtra("placeholdertext", placeholders);
            intent.putExtra("storytext",MyStory.toString() );

            TextView placeholderremaining = (TextView)findViewById(R.id.placeholderRemaining);
            placeholderremaining.setText("" + MyStory.getPlaceholderRemainingCount());

            EditText placeput2 = (EditText) findViewById(R.id.editplace);
            placeput2.setHint("" + MyStory.getNextPlaceholder());
            placeput2.setText("");

            MyStory.getPlaceholderCount();
            MyStory.getPlaceholderRemainingCount();
            if (MyStory.isFilledIn())
                startActivity(intent);


        }
    }