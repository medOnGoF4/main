package com.teclever.stickyheader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String jsonUrl2="http://api.androidhive.info/contacts/";
//        FetchJson fetchJson=new FetchJson(jsonUrl2);
//        fetchJson.start();
        fetch= (Button) findViewById(R.id.button);
        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,StickyHeaderList.class);
                startActivity(intent);
            }
        });
    }
}
