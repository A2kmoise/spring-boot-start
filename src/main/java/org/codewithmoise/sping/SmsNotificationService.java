package org.codewithmoise.sping;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SmsNotificationService implements NotificationService {

    @Override
    public  void sendNotification(String message){
        System.out.println("Sms: "+ message + " done");
    }
}
