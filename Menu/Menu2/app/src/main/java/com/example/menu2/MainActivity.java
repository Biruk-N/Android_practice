package com.example.menu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btnShow);
        registerForContextMenu(btn);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add(0, v.getId(), 0, "Upload");
        menu.add(0, v.getId(), 0, "Search");
        menu.add(0, v.getId(), 0, "Share");
        menu.add(0, v.getId(), 0, "Bookmark");

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
//         String = item.getTitle();
//        if(item.getTitle() == "Upload") {
//            Intent uploadIntent = new Intent(this, UploadActivity.class);
//            startActivity(uploadIntent);
//        }else if(item.getTitle() == "Search"){
//            Intent searchIntent = new Intent(this, SearchActivity.class);
//            startActivity(searchIntent);
//        }else if(item.getTitle() == "Share"){
//            Intent shareIntent = new Intent(this, ShareActivity.class);
//            startActivity(shareIntent);
//        }else if(item.getTitle() == "Bookmark"){
//            Intent bookIntent = new Intent(this, BookmarkActivity.class);
//            startActivity(bookIntent);
//        }


        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}