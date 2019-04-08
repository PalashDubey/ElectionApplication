package com.myapp.electionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class BoothActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booth2);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        GetDetails getDetails = new GetDetails(this,recyclerView);
        getDetails.execute();

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(BoothActivity2.this, Main2Activity.class));
        finish();
    }
}
