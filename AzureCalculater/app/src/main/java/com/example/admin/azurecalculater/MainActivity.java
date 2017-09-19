package com.example.admin.azurecalculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Spinner spinner;
    TextView input, output;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        input = (TextView)findViewById(R.id.input);
        output = (TextView)findViewById(R.id.outPut);
        calculate = (Button)findViewById(R.id.calc);
        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.calc)
        {
            String value = spinner.getSelectedItem().toString();
            double cost;
            double amountOfGBs = Double.parseDouble(input.getText().toString());

            if (value.equals("Geographically"))
            {
                Log.d("Inside", " Amount : " + amountOfGBs);
                if (amountOfGBs < 1000)
                {
                    cost = amountOfGBs * 0.125;
                }
                else
                {
                    cost = 1000 * 0.125;
                    amountOfGBs -= 1000;
                    cost += amountOfGBs * 0.11;
                }
            }
            else
            {
                Log.d("Inside", " Amount : " + amountOfGBs);
                if (amountOfGBs < 1000)
                {
                    cost = amountOfGBs * 0.093;
                }
                else
                {
                    cost = 1000 * 0.093;
                    amountOfGBs -= 1000;
                    cost += amountOfGBs * 0.083;
                }
            }

            Log.d("output", "Redundeacy :" + value + " Cost : " + cost + " GB's : " + amountOfGBs);

            output.setText("Cost : $" + cost);
        }
    }
}
