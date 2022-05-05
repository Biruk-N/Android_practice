package com.example.file_read;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

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
//        Button btn = (Button) findViewById(R.id.button);
//        TextView txtview;
//        btn.setOnClickListener(
//                txtview = (TextView) findViewById(R.id.textView);
//                txtview.setText("hello");
//        );
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
            reader.readLine();
            while ((line = reader.readLine()) != null) {
//                split
                String[] tokens = line.split(",");
//                read
                temp sample = new temp();
                sample.setMonth(tokens[0]);
                if(tokens[1].length() > 0){
//                    sample.setTemp();
                    sample.setTemp(Double.parseDouble(tokens[1]));
                }
                else {
                    sample.setTemp(0.0);
                }
//                if(tokens[1].length() > 0){
////                    sample.setTemp();
//                    sample.setTemp(Double.parseDouble(tokens[1]));
//                }
//                else {
//                    sample.setTemp(0.0);
//                }
//                temp.add(sample);
                Log.d("MyActivity", "just start" + sample);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
    }

}
}