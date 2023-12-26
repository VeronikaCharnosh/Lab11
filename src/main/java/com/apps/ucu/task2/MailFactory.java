package com.apps.ucu.task2;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;

import com.apps.ucu.task2.strategies.BirthdaySender;
import com.apps.ucu.task2.strategies.GiftSender;
import com.apps.ucu.task2.strategies.MailSender;

public class MailFactory {
    private static List<Class<? extends MailSender>> mails = Arrays.asList(BirthdaySender.class, GiftSender.class);

    @SneakyThrows
    public static void getMail(MailInfo info) {
        MailSender sending = mails.get(info.getMailCode()).newInstance();
        sending.sendMail(info);
    }
}