package com.learning.elite.cafe;


interface MyRunnable {
    void myRun();
    void printElements();
}

class Test implements MyRunnable {

    @Override
    public void myRun() {

    }

    @Override
    public void printElements() {

    }
}


public class AnonymousClassExample {

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable() {
            @Override
            public void myRun() {
                System.out.println(" Inside myRun");

            }

            @Override
            public void printElements() {
                System.out.println(" Inside printElements");

            }
        };

        runnable.myRun();
        runnable.printElements();
    }

}
