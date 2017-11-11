package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView playList = (TextView) findViewById(R.id.playList);


        playList.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {

                Intent playList = new Intent(MainActivity.this, playList.class);

                startActivity(playList);

            }

        });
        TextView MusicSearch = (TextView) findViewById(R.id.MusicSearch);

        MusicSearch.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the family category is clicked on.

            @Override

            public void onClick(View view) {


                Intent MusicSearch = new Intent(MainActivity.this, MusicSearch.class);


                startActivity(MusicSearch);

            }

        });


        TextView colors = (TextView) findViewById(R.id.RandomMusic);


        colors.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the colors category is clicked on.

            @Override

            public void onClick(View view) {

                Intent RandomMusic = new Intent(MainActivity.this, RandomMusic.class);

                startActivity(RandomMusic);

            }

        });
    }
}

