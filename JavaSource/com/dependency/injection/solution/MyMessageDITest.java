package com.dependency.injection.solution;

public class MyMessageDITest {
    public static void main(String[] args) {

        String message = "Hey Raghavendra";

        //Sending an email;
        MyDIApplication emailApplication = new MyDIApplication(new EmailServiceImpl());
        emailApplication.processMessages(message, "raghav@gmail.com");

        //Send a sms
        MyDIApplication smsApplication = new MyDIApplication(new SMSServiceImpl());
        smsApplication.processMessages(message, "1234567890");

    }

}
