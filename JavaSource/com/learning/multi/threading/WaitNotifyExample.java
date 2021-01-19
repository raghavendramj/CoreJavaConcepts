package com.learning.multi.threading;

class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

class Waiter implements Runnable{

    private Message msg;

    public Waiter(Message m){
        this.msg=m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try{
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                msg.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+msg.getMessage());
        }
    }
}

class Notifier implements Runnable {

    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMessage(name+" Notifier work done");
                //msg.notify();
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

public class WaitNotifyExample {

    public static void main(String[] args) {

        //Shared resource
        Message msg = new Message("process it");


        Waiter waiter1 = new Waiter(msg);
        Thread waiterThread1 =  new Thread(waiter1,"waiter-01");
        waiterThread1.start();

        Waiter waiter2 = new Waiter(msg);
        Thread waiterThread2 =  new Thread(waiter2,"waiter-02");
        waiterThread2.start();

        Notifier notifier = new Notifier(msg);
        Thread notifierThread = new Thread(notifier, "notifier");
        notifierThread.start();


        System.out.println("All the threads are started");
    }

}
