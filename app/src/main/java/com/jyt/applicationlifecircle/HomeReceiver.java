package com.jyt.applicationlifecircle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by OFFICE on 2016/9/6.
 */
public class HomeReceiver extends BroadcastReceiver {

        private static final String LOG_TAG = "HomeReceiver";
        private static final String SYSTEM_DIALOG_REASON_KEY = "reason";
        private static final String SYSTEM_DIALOG_REASON_RECENT_APPS = "recentapps";
        private static final String SYSTEM_DIALOG_REASON_HOME_KEY = "homekey";
        private static final String SYSTEM_DIALOG_REASON_LOCK = "lock";
        private static final String SYSTEM_DIALOG_REASON_ASSIST = "assist";

        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(Intent.ACTION_CLOSE_SYSTEM_DIALOGS)) {
                String reason = intent.getStringExtra(SYSTEM_DIALOG_REASON_KEY);
                Log.e(LOG_TAG, "reason: " + reason);

                if (SYSTEM_DIALOG_REASON_HOME_KEY.equals(reason)) {
                    // 短按Home键
                    Log.e(LOG_TAG, "homekey");

                }
                else if (SYSTEM_DIALOG_REASON_RECENT_APPS.equals(reason)) {
                    // 长按Home键 或者 activity切换键
                    Log.e(LOG_TAG, "long press home key or activity switch");

                }
                else if (SYSTEM_DIALOG_REASON_LOCK.equals(reason)) {
                    // 锁屏
                    Log.e(LOG_TAG, "lock");
                }
                else if (SYSTEM_DIALOG_REASON_ASSIST.equals(reason)) {
                    // samsung 长按Home键
                    Log.e(LOG_TAG, "assist");
                }

            }

            if (action.equals(Intent.ACTION_SCREEN_ON)) {
                Log.e(LOG_TAG, "screen_on");
            }

            if (action.equals(Intent.ACTION_SCREEN_OFF)) {
                Log.e(LOG_TAG, "screen_off");
            }
            if (action.equals(Intent.ACTION_USER_BACKGROUND)) {
                Log.e(LOG_TAG, "background");
            }

            if (action.equals(Intent.ACTION_USER_FOREGROUND)) {
                Log.e(LOG_TAG, "foreground");
            }

            if (action.equals(Intent.ACTION_USER_PRESENT)) {
                Log.e(LOG_TAG, "unlock");
            }
        }

    }

