package com.apps.ucu.task2;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Julia", 19, "f");
        System.out.println(client1);
        Client client2 = new Client("Mark", 20, "m");
        System.out.println(client2);
        MailBox box = new MailBox();
        MailInfo info1 = new MailInfo(client1, 0);
        MailInfo info2 = new MailInfo(client2, 1);
        box.addMailinfo(info1);
        box.addMailinfo(info2);
        MailBox box2 = new MailBox();
        MailInfo info3 = new MailInfo(client1, 0);
        box2.addMailinfo(info3);

        box.sendAll();
        box2.sendAll();
    }
}
