package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class search_music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_music);

        TextView play_classic = (TextView) findViewById(R.id.play_classic);

        play_classic.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent play_classic = new Intent(search_music.this, PlayTheSong.class);

                startActivity(play_classic);

            }

        });
    }
}
