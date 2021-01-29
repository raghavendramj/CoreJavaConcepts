package com.dependency.injection.solution;

public class MyDIApplication {

    private MessageService service;

    public MyDIApplication(MessageService service){
        this.service = service;
    }

    public void processMessages(String message, String rec) {
        this.service.sendMessage(message, rec);
    }
}
