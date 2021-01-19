package com.learning.multi.threading;


class MyThreadOfSleep extends Thread {

    public void run(){
        for (int i=0; i< 5; i++) {
            System.out.println("Thread "+ Thread.currentThread().getName() + " is waiting... for 500 millseconds");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class SleepExample {

    public static void main(String[] args) throws InterruptedException {
        MyThreadOfSleep threadOfSleep0 = new MyThreadOfSleep();
        MyThreadOfSleep threadOfSleep1 = new MyThreadOfSleep();
        MyThreadOfSleep threadOfSleep2 = new MyThreadOfSleep();
        threadOfSleep0.start();

        threadOfSleep0.join();
        threadOfSleep1.start();

        threadOfSleep1.join();
        threadOfSleep2.start();
    }
}
