package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Romance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);

        TextView romance_one = (TextView) findViewById(R.id.romance_one);

        romance_one.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent romance_one = new Intent(Romance.this, PlayTheSong.class);

                startActivity(romance_one);

            }

        });

        TextView romance_two = (TextView) findViewById(R.id.romance_two);

        romance_two.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent romance_two = new Intent(Romance.this, PlayTheSong.class);

                startActivity(romance_two);

            }

        });
        TextView romance_three = (TextView) findViewById(R.id.romance_three);

        romance_three.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent romance_three = new Intent(Romance.this, PlayTheSong.class);

                startActivity(romance_three);

            }

        });
        TextView romance_four = (TextView) findViewById(R.id.romance_four);

        romance_four.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override

            public void onClick(View view) {

                Intent romance_four = new Intent(Romance.this, PlayTheSong.class);

                startActivity(romance_four);

            }

        });
    }
}
