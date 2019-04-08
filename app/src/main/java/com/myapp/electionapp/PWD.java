package com.myapp.electionapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PWD extends AppCompatActivity {

    String uri="geo:0,0?q=india";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pwd);

        Button pickUpPoint = (Button) findViewById(R.id.pickUpPoint);
        pickUpPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse(uri);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
                TextView locationPoints=(TextView) findViewById(R.id.pickUpPointText);
                locationPoints.setText("ok");
            }
        });

        final Button pwdApp = (Button) findViewById(R.id.pwdApp);
        pwdApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pwdIntent = getPackageManager().getLaunchIntentForPackage("pwd.eci.com.pwdapp");
                if (pwdIntent!= null) {
                    startActivity(pwdIntent);
                } else {
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://play.google.com/store/apps/details?id=pwd.eci.com.pwdapp"));
                    startActivity(i);
                }
            }
        });

    }
}
