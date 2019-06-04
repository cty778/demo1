package com.cty.administrator.demo1;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;

public class DatePickerAndTimePicker extends AppCompatActivity {
    private TimePicker timePicker;
    private DatePicker datePicker;
    private Calendar cal;
    private int year;
    private int month;
    private int day;
    private int hour;
    private  int minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_and_time_picker);
        cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH)+1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        hour = cal.get(Calendar.HOUR_OF_DAY);
        minute = cal.get(Calendar.MINUTE);
        setTitle(year+"-"+month+"-"+day+"-"+hour+"-"+minute);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        timePicker = (TimePicker) findViewById(R.id.timePicker);

        datePicker.init(year, cal.get(Calendar.MONTH), day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                setTitle(year+"-"+(monthOfYear+1)+"-"+dayOfMonth+"-"+cal.get(Calendar.HOUR_OF_DAY)+"-"+cal.get(Calendar.MINUTE));
            }
        });
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                setTitle(year+"-"+(cal.get(Calendar.MONTH)+1)+"-"+day+"-"+hourOfDay+"-"+minute);
            }
        });
        new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                setTitle(year+"-"+(month+1)+"-"+dayOfMonth);
            }
        },year,cal.get(Calendar.MONTH),day);

        new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                setTitle(hourOfDay+"-"+minute);
            }
        },  hour,  minute,true).show();
    }
}
