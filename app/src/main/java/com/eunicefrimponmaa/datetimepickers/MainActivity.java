package com.eunicefrimponmaa.datetimepickers;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePickerDialog(View view) {
        DialogFragment newFragment= new DialogFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new DialogFragment();
        newFragment.show(getSupportFragmentManager(),getString(R.string.time_picker));

    }

    public void processDatePickerResult(int year, int month, int day){
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string =  Integer.toString(year);
        // usa date format
        String dateMessage = (month_string + "/"+ day_string+"/"+year_string);
        Toast.makeText(this, R.string.date+ dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void  processTimePickerREsult(int hourOfDay, int minute){
        //convert time elements into strings
        String hour_string =  Integer.toString(hourOfDay);
        String minute_String = Integer.toString(minute);

        //assign the concatenated strings to timeMesssage
        String timeMessage = (hour_string+":"+minute_String);
        Toast.makeText(this, getString(R.string.time)+timeMessage, Toast.LENGTH_SHORT).show();

    }
}
