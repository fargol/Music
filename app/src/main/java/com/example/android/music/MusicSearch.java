package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MusicSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_search);



        TextView music_search = (TextView) findViewById(R.id.music_search);

        music_search.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent music_search = new Intent(MusicSearch.this, search_music.class);

                startActivity(music_search);

            }

        });

        TextView Buy = (TextView) findViewById(R.id.Buy);

        Buy.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent Buy = new Intent(MusicSearch.this, BuyTheMusic .class);

                startActivity(Buy);

            }

        });
    }
}
