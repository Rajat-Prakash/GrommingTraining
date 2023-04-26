package org.example.FactoryDesign;

public class Service {
    public static void main(String[] args) {
        NotificationFactory notificationFactory=new NotificationFactory();
        Notification notification=notificationFactory.createNotification("SMS");
        notification.sendNotification();
    }
}
