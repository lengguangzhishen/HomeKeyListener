package com.jyt.applicationlifecircle;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Baseactivity {

    private HomeReceiver homeReceiver;
    private IntentFilter homeFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeReceiver = new HomeReceiver();
        homeFilter = new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
        registerReceiver(homeReceiver, homeFilter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (homeReceiver != null) {
            unregisterReceiver(homeReceiver);
            homeReceiver = null;
        }
    }

    public void click(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
