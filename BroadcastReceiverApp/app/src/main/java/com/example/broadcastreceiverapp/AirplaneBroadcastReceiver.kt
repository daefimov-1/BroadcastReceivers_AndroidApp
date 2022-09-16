package com.example.broadcastreceiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val airplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return
        if(airplaneModeEnabled) {
            Toast.makeText(context, "Airplane mode is enabled", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context, "Airplane mode is disabled", Toast.LENGTH_LONG).show()
        }
    }
}