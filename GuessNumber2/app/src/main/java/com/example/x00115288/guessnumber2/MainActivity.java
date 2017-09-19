package com.example.x00115288.guessnumber2;

import android.app.Activity;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {

    private int low = 0;
    private int high = 0;
    private int guess = 0;

    private Button startButton, tooHighButton, tooLowButton, correctButton;
    private TextView guessView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guessView = (TextView)findViewById(R.id.textView);

        startButton = (Button)findViewById(R.id.startButton);
        startButton.setOnClickListener(this);
        tooHighButton = (Button)findViewById(R.id.highButton);
        tooHighButton.setOnClickListener(this);
        tooLowButton = (Button)findViewById(R.id.lowButton);
        tooLowButton.setOnClickListener(this);
        correctButton = (Button)findViewById(R.id.correctButton);
        correctButton.setOnClickListener(this);

        startButton.setVisibility(View.VISIBLE);
        tooHighButton.setVisibility(View.INVISIBLE);
        tooLowButton.setVisibility(View.INVISIBLE);
        correctButton.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.startButton)
        {
            makeGuess();

            startButton.setEnabled(false);
            tooHighButton.setVisibility(View.VISIBLE);
            tooHighButton.setEnabled(true);
            tooLowButton.setVisibility(View.VISIBLE);
            tooLowButton.setEnabled(true);
            correctButton.setVisibility(View.VISIBLE);
            correctButton.setEnabled(true);

        }
        else if (v.getId() == R.id.highButton)
        {
            high = Integer.parseInt(guessView.getText().toString());

            makeGuess();
        }
        else if (v.getId() == R.id.lowButton)
        {
            low = Integer.parseInt(guessView.getText().toString());

            makeGuess();
        }
        else if (v.getId() == R.id.correctButton)
        {
            high = 100;
            low = 0;

            startButton.setVisibility(View.VISIBLE);
            startButton.setEnabled(true);
            tooHighButton.setVisibility(View.INVISIBLE);
            tooLowButton.setVisibility(View.INVISIBLE);
            correctButton.setVisibility(View.INVISIBLE);
        }
    }

    public void makeGuess()
    {
        guess = low + (int)(Math.random() * ((high - low) + 1));

        Log.d("guess", "min: " + low + " max : " + high + " guess: " + guess);

        guessView.setText("" + guess);
    }
}
