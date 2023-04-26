package org.example.FactoryDesign;

public class PushNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Push notification sent successfully");
    }
}
