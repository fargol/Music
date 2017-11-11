package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class playList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        TextView classicMusic = (TextView) findViewById(R.id.classic_music);

        classicMusic.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent playList = new Intent(playList.this, PlayTheSong.class);

                startActivity(playList);

            }

        });
        TextView pop = (TextView) findViewById(R.id.pop_play);

        pop.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent pop = new Intent(playList.this, pop_music.class);

                startActivity(pop);

            }

        });
        TextView Romance = (TextView) findViewById(R.id.random_music);


        Romance.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent Romance = new Intent(playList.this, Romance.class);

                startActivity(Romance);

            }

        });
    }
}
