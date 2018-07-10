package com.gps.gdl.visa.demo.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivityTAG";
    private DynamicReceiver dynamicReceiver = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_PACKAGE_ADDED);
        intentFilter.addDataScheme("otpAppAction");
        DynamicReceiver dynamicReceiver = new DynamicReceiver();
        registerReceiver(dynamicReceiver, intentFilter);
        */
// Create an IntentFilter instance.
        IntentFilter intentFilter = new IntentFilter();

        // Add network connectivity change action.
        intentFilter.addAction("otpAppAction");

        // Set broadcast receiver priority.
        intentFilter.setPriority(100);

        // Create a network change broadcast receiver.
        dynamicReceiver = new DynamicReceiver();

        // Register the broadcast receiver with the intent filter object.
        registerReceiver(dynamicReceiver, intentFilter);
    }

    public void receiverClick(View view) {
        Intent intent = new Intent();
        intent.setAction("otpAppAction");
        intent.putExtra("otpResponse", "Kiwichito!!");
        sendBroadcast(intent);
        /*
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        startActivity(intent);
        */
        /*
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        */
        /*
        Log.d(TAG, "receiverClick: ");
        dynamicReceiver = new DynamicReceiver();
        this.registerReceiver(dynamicReceiver, new IntentFilter(
                "kiwichito"));
        //Toast.makeText(this, "Registered broadcast receiver", Toast.LENGTH_SHORT)
          //      .show();

        Intent intent = new Intent();
        intent.setAction("otpAppAction");
        intent.putExtra("otpResponse", "Kiwichito!!");

        sendBroadcast(intent);

*/
    }
}
