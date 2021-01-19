package com.learning.multi.threading;

public class DeadLockScenario {



    public static void main(String[] args) {


        final String resource1 = "Virat";
        final String resource2 = "Kohli";


        Thread thread1 = new Thread() {

            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread  "+ Thread.currentThread().getName() + " locked resource1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2){
                        System.out.println("Thread  "+ Thread.currentThread().getName() + " locked resource2");
                    }
                }
            }
        };

        Thread thread2 = new Thread() {

            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread  "+ Thread.currentThread().getName() + " locked resource2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1){
                        System.out.println("Thread  "+ Thread.currentThread().getName() + " locked resource1");
                    }
                }
            }
        };


        thread1.start();
        thread2.start();

    }
}
