package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_music);
        TextView Random_search = (TextView) findViewById(R.id.Random_search);

        Random_search.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent Random_search = new Intent(RandomMusic.this, play_random_music.class);

                startActivity(Random_search);

            }

        });
    }
}
