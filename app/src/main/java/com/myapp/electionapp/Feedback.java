package com.myapp.electionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {


    TextView message;
    EditText feedbackMessage, name;
    Button submit;
    RatingBar ratingBar;
    float Value;
    TextView ratedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        message = (TextView)findViewById(R.id.message);
        name = (EditText) findViewById(R.id.name);
        feedbackMessage = (EditText) findViewById(R.id.feedbackMessage);
        submit = (Button)findViewById(R.id.submit);

        ratingBar=findViewById(R.id.ratingBar);
        ratedValue=findViewById(R.id.rateValue);
        submit=findViewById(R.id.submit);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Value=ratingBar.getRating();
                ratedValue.setText(String.valueOf(Value));
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send();
            }
        });
    }

    public void send(){
        String sname = name.getText().toString();
        String sfeedback = feedbackMessage.getText().toString();
        AddFeedback addFeedback = new AddFeedback(this,message,sname,sfeedback);
        addFeedback.execute(sname,sfeedback,String.valueOf(Value));
    }
}
