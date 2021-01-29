package com.dependency.injection.problem;

public class MyApplication {

    private EmailService email = null;

    public MyApplication(EmailService service) {
        this.email = service;
    }

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rec);
    }
}
