package com.erturk.ceyhun.zuproject;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by DELL on 16.10.2015.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "hCHzAXceoqs0qZgFCTIieuf3aBKZ8bEauxh3YbL9", "7IXMRjCpeVqJW91LO4fQbuL76HgEt3Y5qCZkbYkz");
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }
}
