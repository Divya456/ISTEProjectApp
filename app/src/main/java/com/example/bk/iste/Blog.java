package com.example.bk.iste;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Blog extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        //Intent intent = getIntent();
        //Uri data = intent.getData();
        //String path = data.getPath();
        //setUpMessage1();
    }
    public void setUpMessage1(){

        Button messageButton = (Button) findViewById(R.id.chronicleevents);
        messageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Crypt.this, CryptSecondActivity.class));
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i);
            }

        });

    }

}
