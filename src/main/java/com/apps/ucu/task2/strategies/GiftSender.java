package com.apps.ucu.task2.strategies;

import com.apps.ucu.task2.Client;
import com.apps.ucu.task2.MailInfo;

public class GiftSender extends MailSender{
    private String message = "You received a gift!";

    public void sendMail(MailInfo info) {
        Client cl = info.getCl();
        System.out.println("Message: " + this.message + 
        "was sent to client: " + cl.getName());
    }
}