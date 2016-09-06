package com.jyt.applicationlifecircle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by OFFICE on 2016/9/6.
 */
public class Baseactivity extends AppCompatActivity {

    private static final String TAG = "Baseactivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "create");
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.e(TAG, "onuserleavehint");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "resume");
    }
}
