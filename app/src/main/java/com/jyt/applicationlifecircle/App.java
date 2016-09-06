package com.jyt.applicationlifecircle;

import android.app.Application;
import android.util.Log;

/**
 * Created by OFFICE on 2016/9/6.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("application", "oncreate");

    }


}
