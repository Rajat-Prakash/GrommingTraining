package org.example.FactoryDesign;

public class NotificationFactory {
    public Notification createNotification(String str)
    {
        if(str.equals("SMS")){
            return new SMS();
        }
        else if(str.equals("Email"))
        {
            return new Email();
        }
        else if(str.equals("Push Notification"))
        {
            return new PushNotification();
        }
        else return null;
    }
}
