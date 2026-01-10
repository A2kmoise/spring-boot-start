package org.codewithmoise.sping;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message){
        System.out.println("Email: " + message + " done");
    }
}
