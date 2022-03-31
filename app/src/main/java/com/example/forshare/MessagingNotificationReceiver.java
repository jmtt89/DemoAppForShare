package com.example.forshare;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.messaging.sdk.Messaging;
import com.messaging.sdk.MessagingNotification;

import java.io.Serializable;

public class MessagingNotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean hasError = intent.getBooleanExtra(Messaging.INTENT_EXTRA_HAS_ERROR,true);
        if(!hasError) {
            String action = intent.getAction();
            Serializable data = intent.getSerializableExtra(Messaging.INTENT_EXTRA_DATA);
            MessagingNotification notification = (MessagingNotification) data;
            Log.d("NotificationReceiver", "onReceive: " + notification.toString());
        }
    }
}