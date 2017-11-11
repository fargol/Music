package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pop_music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_music);

        TextView pop_sorry = (TextView) findViewById(R.id.pop_sorry);

        pop_sorry.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent pop_sorry = new Intent(pop_music.this, PlayTheSong.class);

                startActivity(pop_sorry);

            }

        });

        TextView pop_roar = (TextView) findViewById(R.id.pop_roar);

        pop_roar.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent pop_roar = new Intent(pop_music.this, PlayTheSong.class);

                startActivity(pop_roar);

            }

        });
        TextView dark_hourse = (TextView) findViewById(R.id.pop_dark_hourse);

        dark_hourse.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent dark_hourse = new Intent(pop_music.this, PlayTheSong.class);

                startActivity(dark_hourse);

            }

        });
        TextView pop_blank_space = (TextView) findViewById(R.id.pop_blank_space);

        pop_blank_space.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent pop_blank_space = new Intent(pop_music.this, PlayTheSong.class);

                startActivity(pop_blank_space);

            }

        });
        TextView pop_let_me_go = (TextView) findViewById(R.id.pop_let_me_go);

        pop_let_me_go.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent pop_let_me_go = new Intent(pop_music.this, PlayTheSong.class);

                startActivity(pop_let_me_go);

            }

        });
    }
}
