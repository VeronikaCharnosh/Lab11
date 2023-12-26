package com.apps.ucu.task2.strategies;

import com.apps.ucu.task2.Client;
import com.apps.ucu.task2.MailInfo;

public abstract class MailSender {
    private String message = "Nothing specific";

    public void sendMail(MailInfo info){
        Client cl = info.getCl();
        System.out.println("Message: " + this.message + 
        "was sent to client: " + cl.getName());
    }
}