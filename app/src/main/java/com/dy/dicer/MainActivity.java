package com.dy.dicer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView[] diceImages;
    private Random randomDiceNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomDiceNum = new Random();
        diceImages = new ImageView[2];
        diceImages[0] = findViewById(R.id.imageView);
        diceImages[1] = findViewById(R.id.imageView3);
    }

    public void rollDice(View view) {
        for(ImageView diceImage : diceImages)
        {
            //Range starts from zero and is exclusive of bound
            int rand = randomDiceNum.nextInt(6) + 1;
            switch(rand)
            {
                case 1 : diceImage.setImageResource(R.drawable.dice1);
                    break;
                case 2 : diceImage.setImageResource(R.drawable.dice2);
                    break;
                case 3 : diceImage.setImageResource(R.drawable.dice3);
                    break;
                case 4 : diceImage.setImageResource(R.drawable.dice4);
                    break;
                case 5 : diceImage.setImageResource(R.drawable.dice5);
                    break;
                case 6 : diceImage.setImageResource(R.drawable.dice6);
                    break;

            }
        }
    }
}
