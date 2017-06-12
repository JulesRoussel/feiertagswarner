package com.example.android.nchstefeirtag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.*;
import java.text.SimpleDateFormat ;

import static android.R.id.message;

public class Feiertag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feiertag);
        TextView t = (TextView) findViewById(R.id.AktuellesDatum);
        String message = "Aktuelles Datum : \n" + date;
        t.setText(message);


    }


}
