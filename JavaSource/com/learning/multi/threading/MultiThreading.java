package com.learning.multi.threading;


class MyThread extends Thread {

    public void run(){

        Thread currentThread = Thread.currentThread();
        System.out.println("My Run Method and Name is: " + currentThread.getName() + " having priority : "+ currentThread.getPriority());
        if(currentThread.isDaemon()){
            System.out.println("\n\n ************** Its a daemon thread! "+ currentThread.getName() + " having priority : "+ currentThread.getPriority());
        }
    }
}


class MyRunnable implements Runnable{

    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println("My Run Runnable thread Name is:"+ currentThread.getName()
                + "\n having priority : "+ currentThread.getPriority()
                + "\n belongs to thread group : "+ currentThread.getThreadGroup());

    }
}

public class MultiThreading {

    public static void main(String[] args) {

        //1st way to create a thread is
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();



//
//        thread2.setDaemon(true);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//
//        thread1.setName("eLite-Cafe Thread - 01");
//        thread2.setName("America - 02");
//        thread3.setName("India - 03");
//        thread4.setName("Australia - 04");
//
//        thread4.setPriority(Thread.MAX_PRIORITY);



        ThreadGroup threadGroup = new ThreadGroup(" Group A");
        //2nd way to create a thread is
        MyRunnable runnableThread = new MyRunnable();

        Thread threadFromRunnable1  = new Thread(threadGroup, runnableThread, " One ");
        Thread threadFromRunnable2  = new Thread(threadGroup, runnableThread, " Two ");
        Thread threadFromRunnable3  = new Thread(threadGroup, runnableThread, " Three ");
        threadFromRunnable1.start();
        threadFromRunnable2.start();
        threadFromRunnable3.start();
    }
}
