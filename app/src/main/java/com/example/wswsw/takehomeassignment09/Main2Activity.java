package com.example.wswsw.takehomeassignment09;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference questionRef = database.getReference("question");
    private DatabaseReference questionRef2 = database.getReference("multiple questions");

    private Date d=new Date();
    private TextView dateTimeDisplay;
    //private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        dateTimeDisplay = (TextView)findViewById(R.id.text_date_display);
        //returns the time of a Calendar object initialized with the current date and time
        d = Calendar.getInstance().getTime();

        //parse and format dates
        dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        date = dateFormat.format(d);

        dateTimeDisplay.setText(date);
    }

    //save the data to the reference, replace the existing one
    public void setQuestion(View view){
        questionRef.setValue(new Client("Erin","China",22,false));
    }

    //generates a unique key every time a new child is added to the reference
    public void addQuestion(View view){
        questionRef2.push().setValue(new Client("Mary","British",65,false));
    }

}
