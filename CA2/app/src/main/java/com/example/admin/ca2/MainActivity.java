package com.example.admin.ca2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.inputmethod.InputMethodManager;

import java.util.ArrayList;

//Karl Burke
//x00115288

public class MainActivity extends AppCompatActivity implements OnClickListener {

    ArrayList<APIVersion> apis;
    Button searchButton;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        APIVersion apiV = new APIVersion();

        apis = new ArrayList<APIVersion>();
        apis = apiV.apiList();
        searchButton = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);
        textView = (TextView)findViewById(R.id.textView);

        searchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //Closes the keyboard after clicking the search button
        InputMethodManager inputManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

        //Validates weather the input is an int
        boolean checkInt = tryParseInt(editText.getText().toString());

        //If the value is an int do this
        if (checkInt == true)
        {
            //Converts value to an int
            int level = Integer.parseInt(editText.getText().toString());

            //Foreach loop to go through the list
            for (APIVersion a : apis)
            {
                //If the input equals an api level in the list
                if (a.getApiLevel() == level)
                {
                    //Add the data to the textview
                    textView.setText("Code Name : " + a.getCodeName() + "\tPlatform Version : " + a.getPlatformVersion()
                            + "\tAPI Level : " + a.getApiLevel() + "\tYear : " + a.getYear());
                    break;
                }
                else{
                    //Else do this
                    textView.setText("API could not be found");
                }
            }
        }
        //If its not possible to convert the value to an int
        else {
            textView.setText("Only Numbers can be entered in this field");
        }
    }

    //Method to validate if input is an int
    boolean tryParseInt(String value)
    {
        try {
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e)
        {
            return false;
        }
    }
}
