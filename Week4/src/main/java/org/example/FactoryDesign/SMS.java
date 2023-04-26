package org.example.FactoryDesign;

public class SMS implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent successfully");
    }
}
