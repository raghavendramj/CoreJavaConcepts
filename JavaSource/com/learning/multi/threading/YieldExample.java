package com.learning.multi.threading;

class MyThreadOfYield extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is in control");
        }
    }

}

public class YieldExample {

    public static void main(String[] args) {

        MyThreadOfYield thread0 = new MyThreadOfYield();
        MyThreadOfYield thread1 = new MyThreadOfYield();

        thread0.start();
        thread1.start();

        for (int i = 0; i < 3; i++) {
            thread0.yield();
            System.out.println(Thread.currentThread().getName() + " is in control");
        }
        thread1.stop();


    }
}
