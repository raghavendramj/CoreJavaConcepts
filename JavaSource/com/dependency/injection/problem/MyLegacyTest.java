package com.dependency.injection.problem;

public class MyLegacyTest {
    public static void main(String[] args) {
        EmailService email = new EmailService();
        MyApplication app = new MyApplication(email);
        app.processMessages("Hi Pankaj", "pankaj@abc.com");
    }

}
