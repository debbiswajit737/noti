package com.noti.teli

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class NotificationService : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        super.onNotificationPosted(sbn)
        // This method will be called when a new notification is posted
        val packageName = sbn.packageName
        val notificationText = sbn.notification?.tickerText?.toString()
        Log.d("NotificationListener", "New notification from: $packageName - $notificationText")
        // You can handle the notification here
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification) {
        super.onNotificationRemoved(sbn)
        // This method will be called when a notification is removed
    }
}