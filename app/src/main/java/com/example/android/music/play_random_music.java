package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class play_random_music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_random_music);
        TextView play_pop = (TextView) findViewById(R.id.play_pop);

        play_pop.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {
                Intent play_pop = new Intent(play_random_music.this, PlayTheSong.class);
                startActivity(play_pop);

            }

        });
    }
}
