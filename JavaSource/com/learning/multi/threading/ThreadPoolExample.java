package com.learning.multi.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread + " (Start) message = " + message);
        processTheMessage();
        System.out.println(currentThread + " (End)");
    }

    private void processTheMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class ThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread(" " + i);
            executorService.execute(worker);
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
            //System.out.println("Threads completed its job!");
        }

        System.out.println("Finished all the tasks!");
    }
}
