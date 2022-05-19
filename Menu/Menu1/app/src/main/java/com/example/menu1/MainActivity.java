package com.example.menu1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Toast.makeText(this,"Selected Item: "+ item.getTitle(),Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.search:
                Intent searchIntent = new Intent(this, SearchActivity.class);
                startActivity(searchIntent);
                return true;
            case R.id.upload:
                Intent uploadIntent = new Intent(this, UploadActivity.class);
                startActivity(uploadIntent);
                return true;
            case R.id.copy:
                Intent copyIntent = new Intent(this, CopyActivity.class);
                startActivity(copyIntent);
                return true;
            case R.id.print:
                Intent printIntent = new Intent(this, PrintActivity.class);
                startActivity(printIntent);
                return true;
            case R.id.share:
                Intent shareIntent = new Intent(this, ShareActivity.class);
                startActivity(shareIntent);
                return true;
            case R.id.bookmark:
                Intent intent = new Intent(this, BookmarkActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}