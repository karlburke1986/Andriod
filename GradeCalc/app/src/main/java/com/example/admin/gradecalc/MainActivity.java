package com.example.admin.gradecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    EditText editText;
    Button button;
    int input;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        input = Integer.parseInt(editText.getText().toString());

        if ((input >= 0) && (input <= 100)) {
            if (input >= 0 && input <= 34) {
                output = "Your Grade is F";
            } else if (input >= 35 && input <= 39) {
                output = "Your Grade is D";
            } else if (input >= 40 && input <= 49) {
                output = "Your Grade is C";
            } else if (input >= 50 && input <= 54) {
                output = "Your Grade is C+";
            } else if (input >= 55 && input <= 59) {
                output = "Your Grade is B-";
            } else if (input >= 60 && input <= 69) {
                output = "Your Grade is B";
            } else if (input >= 70 && input <= 79) {
                output = "Your Grade is B+";
            } else if (input >= 80 && input <= 100) {
                output = "Your Grade is A";
            }
        }
        else {
            output = "The entered value must be between 0-100";
        }

        textView.setText(output);
    }

}
