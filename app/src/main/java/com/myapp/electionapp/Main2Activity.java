package com.myapp.electionapp;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Hey, download this app!");
                startActivity(shareIntent);
                return true;

            case R.id.settings:
                return true;

            case R.id.about_us:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = findViewById(R.id.main2activity_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  HOME");
        getSupportActionBar().setIcon(getDrawable(R.drawable.home));

        findViewById(R.id.include_card);

        CardView card1 = (CardView)findViewById(R.id.polling_station);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Main2Activity.this, PollingStation.class);
                startActivity(i1);
            }
        });


        CardView card2 = (CardView)findViewById(R.id.candidate);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Main2Activity.this, knowCandidate.class);
                startActivity(i2);
            }
        });


        CardView card3 = (CardView)findViewById(R.id.pwd);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Main2Activity.this, PWD.class);
                startActivity(i3);
            }
        });



        CardView card4 = (CardView)findViewById(R.id.thirdgender);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Main2Activity.this, ThirdGender.class);
                startActivity(i4);
            }
        });


        CardView card5 = (CardView)findViewById(R.id.result);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"To Be Declared. Come Back Later!",Toast.LENGTH_SHORT).show();
            }
        });

        CardView card6 = (CardView)findViewById(R.id.chandanichowk);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Main2Activity.this,AboutChandniChowk.class);
                startActivity(i6);
            }
        });


        BottomNavigationView navigationView;
        navigationView=(BottomNavigationView)findViewById(R.id.navigation);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.navigation_help:
                        Toast.makeText(getApplication(),"Get it yourself.",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.navigation_feedback:
                        Toast.makeText(getApplication(),"Link to Play Store.",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Main2Activity.this,Feedback.class);
                        startActivity(i);
                        break;
                }
                return true;
            }
        });

    }
}
