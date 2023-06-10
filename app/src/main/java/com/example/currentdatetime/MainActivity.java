package com.example.currentdatetime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView Date_With_Month_Name_tv;
    TextView Time_With_AM_PM_tv, Current_Time_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Current_Time_tv = findViewById(R.id.current_time_tv);
        Time_With_AM_PM_tv = findViewById(R.id.time_with_am_pm_tv);
        Date_With_Month_Name_tv = findViewById(R.id.Date_With_Month_Name_tv);

        Current_Time_tv.setText(getCurrentTime());
        Time_With_AM_PM_tv.setText(getTimeWithAmAndPm());
        Date_With_Month_Name_tv.setText(getTodayDateWithMonthName());
    }

    private String getCurrentTime() {
        return new SimpleDateFormat("hh:mm", Locale.getDefault()).format(new date());
    }
    private String getTimeWithAmAndPm() {
        return new SimpleDateFormat("hh:mm a", Locale.getDefault()).format(new date());
    }
    private String getTodayDateWithMonthName() {
        return new SimpleDateFormat("dd/LLL/yyyy", Locale.getDefault()).format(new date());
    }
}