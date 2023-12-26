package com.apps.ucu.task2;

import java.util.*;

public class MailBox {
    private List<MailInfo> infos;

    public MailBox(){
        this.infos = new ArrayList<>();
    }
    
    public void addMailinfo(MailInfo info) {
        this.infos.add(info);
    }

    public void sendAll() {
        for (MailInfo info: this.infos) {
            MailFactory.getMail(info);
        }
    }
}