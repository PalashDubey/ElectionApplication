package com.myapp.electionapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class AboutChandniChowk extends AppCompatActivity {

    ViewFlipper v_flipper;

    int images[] =
            {
                    R.drawable.chandni_chowk,
                    R.drawable.shopping,
                    R.drawable.food,
                    R.drawable.sightseeing
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_chandni_chowk);

        v_flipper = findViewById(R.id.flipper);

        for(int i=0;i<images.length;i++)
        {
            flip_image(images[i]);
        }

    }

    public void flip_image(int i)
    {
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        v_flipper.addView(view);
        v_flipper.setFlipInterval(2200);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
