//package com.learning.multi.threading.syncronization;
//
//class Baggage {
//
//    void pringAlltheBaggages(int number) {
//
//        //...
//
//        System.out.println(" Before  - 01");
//        System.out.println(" Before  - 02");
//        System.out.println(" Before  - 03");
//
//
//        synchronized (this) {
//            for (int i = 1; i <= 5; i++) {
//
//                System.out.println(number * i);
//
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        System.out.println(" After  - 01");
//        System.out.println(" After  - 02");
//        System.out.println(" After  - 03");
//
//        //...
//    }
//}
//
//
//class ThreadOne extends Thread {
//
//    Baggage baggage;
//
//    public ThreadOne(Baggage baggage) {
//        this.baggage = baggage;
//    }
//
//    public void run() {
//        baggage.pringAlltheBaggages(37);
//    }
//
//}
//
//class ThreadTwo extends Thread {
//
//    Baggage baggage;
//
//    public ThreadTwo(Baggage baggage) {
//        this.baggage = baggage;
//    }
//
//    public void run() {
//        baggage.pringAlltheBaggages(10);
//    }
//
//}
//
//
//public class WithoutSynchronization {
//
//
//    public static void main(String[] args) {
//        Baggage baggage = new Baggage();
//
//        ThreadOne one = new ThreadOne(baggage);
//        ThreadTwo two = new ThreadTwo(baggage);
//
//
//        one.start();
//        two.start();
//    }
//}
