package org.codewithmoise.sping;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService{

    @Value("${email.host}")
    private String host;

    @Value("${email.port}")
    private int port;

    @Override
    public void sendNotification(String message){
        System.out.println("Email url: " + host);
        System.out.println("Sender port: " + port);
        System.out.println("Email: " + message + " done");
    }
}
