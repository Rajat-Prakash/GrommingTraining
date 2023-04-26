package org.example.FactoryDesign;

public class Email implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Email notification sent successfully");
    }
}
