package com.apps.ucu.task2.strategies;

import com.apps.ucu.task2.Client;
import com.apps.ucu.task2.MailInfo;

public class BirthdaySender extends MailSender{
    private String message = "Happy birthday! ";

    public void sendMail(MailInfo info) {
        Client cl = info.getCl();
        System.out.println("Message: " + this.message + 
        "was sent to client: " + cl.getName());
    }
}