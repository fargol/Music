package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayTheSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_the_song);

        Button buttonOne = (Button) findViewById(R.id.details);

        buttonOne.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent buttonOne = new Intent(PlayTheSong.this, MainActivity.class);

                startActivity(buttonOne);

            }

        });
    }
}
