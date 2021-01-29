package com.dependency.injection.solution;

public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String rec) {
        System.out.println("SMS sent to "+rec+ " with Message="+message);
    }
}
