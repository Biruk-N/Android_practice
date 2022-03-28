package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    EditText ed1, ed2;
    TextView tx1, tx2;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        ed1 = (EditText) findViewById(R.id.user);
        ed2 = (EditText) findViewById(R.id.pass);
        tx1 = (TextView) findViewById(R.id.txtvi2);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1.getText().toString().equals("test") && ed2.getText().toString().equals("test")){
                    Toast.makeText(getApplicationContext(), "redirecting", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "wrong password", Toast.LENGTH_SHORT).show();

                    ed2.setTextColor(Color.RED);
                    b1.setVisibility(View.VISIBLE);
                    counter --;
                    tx1.setText(Integer.toString(counter));
                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }
                }


        });}
}