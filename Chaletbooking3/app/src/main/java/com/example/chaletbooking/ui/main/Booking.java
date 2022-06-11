package com.example.chaletbooking.ui.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.chaletbooking.R;

public class Booking extends AppCompatActivity {
    EditText editdate, editpayment;
    Spinner spinner1, spinner2, spinner3;
    CalendarView calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);


        editpayment = (EditText) findViewById(R.id.editpayment);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);


        calender = findViewById(R.id.calender);
        // Add Listener in calendar
        calender.setOnDateChangeListener(
                new CalendarView
                        .OnDateChangeListener() {
                    @Override

                    // In this Listener have one method
                    // and in this method we will
                    // get the value of DAYS, MONTH, YEARS
                    public void onSelectedDayChange(
                            @NonNull CalendarView view,
                            int year,
                            int month,
                            int dayOfMonth) {

                        // Store the value of date with
                        // format in String type Variable
                        // Add 1 in month because month
                        // index is start with 0
                        String Date
                                = dayOfMonth + "-"
                                + (month + 1) + "-" + year;

                    }
                });

        Button btnBook = findViewById(R.id.btnBook);
        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Booking.this, "You have booked your chalet successufully", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}

