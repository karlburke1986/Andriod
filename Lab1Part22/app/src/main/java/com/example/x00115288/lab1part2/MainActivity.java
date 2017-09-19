package com.example.x00115288.lab1part2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        addListenerOnButton();
    }

    public void addListenerOnButton()
    {
        Button btnSubmit = (Button) findViewById(R.id.button);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                String celcius = ((EditText) findViewById(R.id.editText)).getText().toString();

                TextView myTextView = ((TextView)findViewById(R.id.textView2));
                Double calc = Double.parseDouble(celcius);

                calc = calc * 1.8 + 32;

                myTextView.setText(Double.toString(calc));
            }
        });
    }
}
