package com.example.itintern3.logo_test;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.Console;

import static com.example.itintern3.logo_test.R.id.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        final ImageView img= (ImageView) findViewById(R.id.image_switcher);
        //img.setImageResource(R.drawable.logo);
        //img.setImageDrawable(ContextCompat(activity_main));
        //img.setImageResource(R.drawable.logo);





        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                //Log.d("next", "next button pressed");
                img.setImageResource(R.drawable.twitter);
            }
        });

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                img.setImageResource(R.drawable.facebook);
            }
        });


        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                img.setImageResource(R.drawable.logo);
            }
        });






    }

}
