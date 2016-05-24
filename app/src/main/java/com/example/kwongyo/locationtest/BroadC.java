package com.example.kwongyo.locationtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by kwongyo on 2016-05-24.
 */
public class BroadC extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("BroadC", "----------" + intent.getAction());
        Toast.makeText(context, "dddd", Toast.LENGTH_SHORT).show();
    }
}
