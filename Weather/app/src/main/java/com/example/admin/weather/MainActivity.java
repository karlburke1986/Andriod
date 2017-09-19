package com.example.admin.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    ArrayList<WeatherData> data;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();
        data.add(new WeatherData("Dublin", 22.0, WeatherCondition.Cloudy));
        data.add(new WeatherData("New York", 5.0, WeatherCondition.Sunny));
        data.add(new WeatherData("Las Vegas", 33.0, WeatherCondition.Sunny));
        data.add(new WeatherData("Amsterdam", 16.0, WeatherCondition.Cloudy));

        List<String> citys = new ArrayList<String>();

        spinner = (Spinner)findViewById(R.id.spinner);

        for(int i = 0; i < data.size(); i++)
        {
            citys.add(data.get(i).getCity());
        }

        ArrayAdapter<String> citysArr = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, citys);
        spinner.setAdapter(citysArr);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String city = parent.getItemAtPosition(position).toString();
        TextView output = (TextView)findViewById(R.id.textView);
        String text = "";

        for (WeatherData w : data)
        {
            if (w.city.equals(city))
            {
                text += "City :" + w.city + " Condition : " + w.condition.toString()
                        + " Temperture : " + w.temperature;

            }
        }
        output.setText("" + text);
    }

    public void onNothingSelected(AdapterView<?> parent)
    {
        //Nothing
    }
}
