package com.example.x00115288.guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener
{
    int low = 0;
    int high = 100;
    int guess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
