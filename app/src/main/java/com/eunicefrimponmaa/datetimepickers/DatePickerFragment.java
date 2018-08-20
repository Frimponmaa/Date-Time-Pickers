package com.eunicefrimponmaa.datetimepickers;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //initialize date with today's date
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        //create new instance of date picker diaglog and return it
        return new DatePickerDialog(getActivity(), this, year, month,day);
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        //	invoke	the processDatePickerResult() method in MainActivity and pass it the year, month, and day
        //set activity to main activity
        MainActivity activity = (MainActivity)getActivity();
        //invoke Main Activity's processDatePickerResult()method
        activity.processDatePickerResult(year, month, dayOfMonth);

    }


}
