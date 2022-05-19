package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mListView = (ListView) findViewById(R.id.list);

        //Create the Person objects
        Customer Biruk = new Customer("Biruk","12-20-1999","22");
        Customer steve = new Customer("Steve","08-03-1987","30");
        Customer stacy = new Customer("Stacy","11-15-2000","23");
        Customer ashley = new Customer("Ashley","07-02-1999","30");
        Customer matt = new Customer("Matt","03-29-2001","56");
        Customer matt2 = new Customer("Matt2","03-29-2001","23");
        Customer matt3 = new Customer("Matt3","03-29-2001","45");
        Customer matt4 = new Customer("Matt4","03-29-2001","55");
        //Add the Person objects to an ArrayList
        ArrayList<Customer> peopleList = new ArrayList<>();
        peopleList.add(Biruk);
        peopleList.add(steve);
        peopleList.add(stacy);
        peopleList.add(ashley);
        peopleList.add(matt);
        peopleList.add(matt2);
        peopleList.add(matt3);
        peopleList.add(matt4);
        CustomerListAdapter adapter = new CustomerListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }
}