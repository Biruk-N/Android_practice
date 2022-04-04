package com.example.apr1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        Intent i1 = new Intent(this, MainActivity2.class);
        String url = "https://google.com/";


        Intent i2 = new Intent(Intent.ACTION_VIEW);
        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(i1);
        }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent ii2=new Intent(i2.ACTION_VIEW);
                i2.setData(Uri.parse(url));
                startActivity(i2);
            }
        });
//        i.setData(Uri.parse(url));
//        startActivity(i);

    }
}