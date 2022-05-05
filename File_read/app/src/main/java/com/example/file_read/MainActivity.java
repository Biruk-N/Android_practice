package com.example.file_read;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        readData();
    }
    private List<temp> temps = new ArrayList<>();
    private void readData(){
//        temp sample;
      InputStream is = getResources().openRawResource(R.raw.tst);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try{
            while ((line = reader.readLine()) != null) {
//                split
                String[] tokens = line.split(",");
//                read
                temp sample = new temp();
                sample.setMonth(tokens[0]);
                sample.setTemp(Double.parseDouble(tokens[1]));
                temp.add(sample);
                Log.d("MyActivity", "just start" + sample);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}