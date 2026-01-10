package org.codewithmoise.sping;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendMessage(String message){
        this.notificationService.sendNotification(message);
    }

}
