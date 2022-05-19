package com.example.menu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnShow);
        btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    PopupMenu popup = new PopupMenu(MainActivity.this, v);
                    popup.setOnMenuItemClickListener(MainActivity.this);
                    popup.inflate(R.menu.menu);
                    popup.show();

                }
        });
    }
    @Override
    public boolean onMenuItemClick(MenuItem item){
        Toast.makeText(this, "Selected Item: "+ item.getTitle(), Toast.LENGTH_SHORT).show();
        switch(item.getItemId()){
            case R.id.search:
                Intent searchintent = new Intent(this, SearchActivity.class);
                startActivity(searchintent);
                return true;
            case R.id.upload:
                Intent uploadintent = new Intent(this, UploadActivity.class);
                startActivity(uploadintent);
                return true;
            case R.id.share:
                Intent shareintent = new Intent(this, ShareActivity.class);
                startActivity(shareintent);
                return true;
            case R.id.copy:
                Intent copyintent = new Intent(this, CopyActivity.class);
                startActivity(copyintent);
                return true;
            case R.id.print:
                Intent printintent = new Intent(this, PrintActivity.class);
                startActivity(printintent);
                return true;
            default:
                return false;
        }
    }
}