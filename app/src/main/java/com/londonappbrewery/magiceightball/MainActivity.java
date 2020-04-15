package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = (Button) findViewById(R.id.askButton);
        final ImageView ball1 = (ImageView) findViewById(R.id.ball1);

        final int[] ballarray =
                {R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int Number = randomNumberGenerator.nextInt(5);

              ball1.setImageResource(ballarray[Number]);




            }


    });

    };
};