package com.example.ade.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt1=(Button) findViewById(R.id.button);
        bt2=(Button) findViewById(R.id.button2);

        bt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myintent= new Intent(MainActivity.this,aboutalc.class);
                startActivity(myintent);
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myintent1= new Intent(MainActivity.this,myprofile.class);
                startActivity(myintent1);
            }
        });
    }
}
