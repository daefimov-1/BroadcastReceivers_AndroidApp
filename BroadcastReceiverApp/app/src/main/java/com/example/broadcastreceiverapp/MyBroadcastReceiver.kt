package com.example.broadcastreceiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.i("MY_RECEIVER", "My Broadcast caught")
        Toast.makeText(context, "My Broadcast caught", Toast.LENGTH_LONG).show()
    }
}