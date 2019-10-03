package com.example.myproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Activity24 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_24);

        //CURRENT TIME IN SYDNEY
        TextView textView = findViewById(R.id.time1);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);

        //CURRENT TIME IN LA
        TextView textView2 = findViewById(R.id.time2);
        ZoneId zoneLA = ZoneId.of("America/Los_Angeles");
        LocalTime localTime = LocalTime.now(zoneLA);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = localTime.format(format);
        textView2.setText(formattedTime);

        //CURRENT TIME IN LONDON
        TextView textView3 = findViewById(R.id.time3);
        ZoneId zoneLondon = ZoneId.of("Europe/London");
        LocalTime localTime1 = LocalTime.now(zoneLondon);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime1 = localTime1.format(format1);
        textView3.setText(formattedTime1);

        //CURRENT TIME IN DHAKA
        TextView textView4 = findViewById(R.id.time4);
        ZoneId zoneDhaka = ZoneId.of("Asia/Dhaka");
        LocalTime localTime2 = LocalTime.now(zoneDhaka);
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime2 = localTime2.format(format2);
        textView4.setText(formattedTime2);

        //CURRENT TIME IN AUCKLAND
        TextView textView5 = findViewById(R.id.time5);
        ZoneId zoneAuckland = ZoneId.of("Pacific/Auckland");
        LocalTime localTime3 = LocalTime.now(zoneAuckland);
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime3 = localTime3.format(format3);
        textView5.setText(formattedTime3);

       //refresh button
        Button refreshButton = findViewById(R.id.refreshButton);
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity24.this, Activity24.class));
            }
        });

        //BUTTON
        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity24.this, MainActivity.class));
            }
        });

        Button button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity24.this, Activity24.class));
            }
        });

        //SHOW AND HIDE CITY TIMES -- note: View.GONE created mishap with layout
        final ImageView sydney;
        final TextView time1;
        Button hideSydney;
        Button showSydney;
        sydney = findViewById(R.id.imageView2);
        showSydney = findViewById(R.id.showSydney);
        hideSydney = findViewById(R.id.hideSydney);
        time1= findViewById(R.id.time1);

        showSydney.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sydney.setVisibility(View.VISIBLE);
                time1.setVisibility(View.VISIBLE);

            }
        });

        hideSydney.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sydney.setVisibility(View.INVISIBLE);
                time1.setVisibility(View.INVISIBLE);


            }
        });

        final ImageView la;
        final TextView time2;
        la =findViewById(R.id.la);
        Button showSydney2 = findViewById(R.id.showSydney2);
        Button hideSydney3 =findViewById(R.id.hideSydney3);
        time2= findViewById(R.id.time2);

        showSydney2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                la.setVisibility(View.VISIBLE);
                time2.setVisibility(View.VISIBLE);

            }
        });

        hideSydney3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                la.setVisibility(View.INVISIBLE);
                time2.setVisibility(View.INVISIBLE);


            }
        });

        final ImageView dhaka;
        final TextView time3;
        dhaka =findViewById(R.id.dhaka);
        Button showSydney3= findViewById(R.id.showSydney3);
        Button hideSydney4=findViewById(R.id.hideSydney4);
        time3= findViewById(R.id.time3);

        showSydney3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                dhaka.setVisibility(View.VISIBLE);
                time3.setVisibility(View.VISIBLE);

            }
        });

        hideSydney4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                dhaka.setVisibility(View.INVISIBLE);
                time3.setVisibility(View.INVISIBLE);


            }
        });

        final ImageView london;
        final TextView time4;
        london =findViewById(R.id.london);
        Button showSydney4= findViewById(R.id.showSydney4);
        Button hideSydney5=findViewById(R.id.hideSydney5);
        time4= findViewById(R.id.time4);

        showSydney4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                london.setVisibility(View.VISIBLE);
                time4.setVisibility(View.VISIBLE);

            }
        });

        hideSydney5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                london.setVisibility(View.INVISIBLE);
                time4.setVisibility(View.INVISIBLE);


            }
        });

        final ImageView auckland;
        final TextView time5;
        auckland =findViewById(R.id.auckland);
        Button showSydney5=findViewById(R.id.showSydney5);
        Button hideSydney6=findViewById(R.id.hideSydney6);
        time5= findViewById(R.id.time5);

        showSydney5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                auckland.setVisibility(View.VISIBLE);
                time5.setVisibility(View.VISIBLE);

            }
        });

        hideSydney6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                auckland.setVisibility(View.INVISIBLE);
                time5.setVisibility(View.INVISIBLE);

            }
        });
    }
}
