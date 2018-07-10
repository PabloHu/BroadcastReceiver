package com.gps.gdl.visa.demo.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class DynamicReceiver extends BroadcastReceiver {
    public static final String TAG ="DynamicReceiverTAG";

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Receiver!!!!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onReceive: ");
       /* String intentJson="";
        try{
            intentJson = intent.getStringExtra("otpResponse");
            Log.d(TAG, "onReceive:Received: "+ intentJson);
        }
        catch (Exception e){
            Log.d(TAG, "DynamiReceiver:onReceive:err: " + e.toString());
        }
        Log.d(TAG, "DynamiReceiver:onReceive:Json: "+ intentJson);
*/
    }




}