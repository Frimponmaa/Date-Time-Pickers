package com.eunicefrimponmaa.datetimepickers;


import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import android.text.format.DateFormat;
import java.util.Calendar;

import static android.text.format.DateFormat.is24HourFormat;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
        //use current time as default values for time picker


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        //create a new instance of time picker and initialize it
        return	new	TimePickerDialog(getActivity(),	this,	hour,	minute,
                DateFormat.is24HourFormat(getActivity()));
    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        //set the activity to the main activity
        MainActivity activity = (MainActivity) getActivity();

        //invoke main activity's processTimePickerResult() method
        activity.processTimePickerREsult(hourOfDay, minute);
    }
}
