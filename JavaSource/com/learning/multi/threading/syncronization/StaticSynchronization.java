package com.learning.multi.threading.syncronization;

class Baggage {

    synchronized static void pringAlltheBaggages(int number) {


        synchronized (Baggage.class){

        }

        for (int i = 1; i <= 5; i++) {

            System.out.println(number * i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class ThreadOne extends Thread {

    Baggage baggage;

    public ThreadOne(Baggage baggage) {
        this.baggage = baggage;
    }

    public void run() {
        baggage.pringAlltheBaggages(6);
    }

}

class ThreadTwo extends Thread {

    Baggage baggage;

    public ThreadTwo(Baggage baggage) {
        this.baggage = baggage;
    }

    public void run() {
        baggage.pringAlltheBaggages(7);
    }

}

class ThreadThree extends Thread {

    Baggage baggage;

    public ThreadThree(Baggage baggage) {
        this.baggage = baggage;
    }

    public void run() {
        baggage.pringAlltheBaggages(10);
    }

}


class ThreadFour extends Thread {

    Baggage baggage;

    public ThreadFour(Baggage baggage) {
        this.baggage = baggage;
    }

    public void run() {
        baggage.pringAlltheBaggages(11);
    }

}


public class StaticSynchronization {


    public static void main(String[] args) {
        Baggage baggage1 = new Baggage();

        ThreadOne one = new ThreadOne(baggage1);
        ThreadTwo two = new ThreadTwo(baggage1);

        one.start();
        two.start();

        Baggage baggage2 = new Baggage();

        ThreadThree three = new ThreadThree(baggage2);
        ThreadFour four = new ThreadFour(baggage2);

        three.start();
        four.start();
    }
}
