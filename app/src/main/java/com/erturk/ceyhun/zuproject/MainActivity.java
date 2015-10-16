package com.erturk.ceyhun.zuproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.ParseObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParseObject testObject = new ParseObject("deneme2");
        testObject.put("foo", "bar");
        testObject.put("foo", "bar2");
        testObject.saveInBackground();
        //selammmm
    }


}
