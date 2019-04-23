package com.example.diccee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roleButton;
        final ImageView leftDice;
        final ImageView rightDice;
        final ImageView logo = (ImageView) findViewById(R.id.logo);
        roleButton = (Button) findViewById(R.id.roleButton);
        leftDice = (ImageView) findViewById(R.id.left_dice);
        rightDice = (ImageView) findViewById(R.id.right_dice);

        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        roleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Button has been pressed!");
                Random randomNumber = new Random();
                int number = randomNumber.nextInt(6);
                //     int number2 = randomNumber.nextInt(6);
                Log.d("random number", "The random number is: " + number);
                leftDice.setImageResource(diceArray[number]);
                number = randomNumber.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
                logo.animate().rotationXBy(360f).setDuration(1000);
            }
        });

    }
}
