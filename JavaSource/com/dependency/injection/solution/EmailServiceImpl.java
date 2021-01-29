package com.dependency.injection.solution;

public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String rec) {
        System.out.println("Email sent to "+rec+ " with Message="+message);
    }
}
