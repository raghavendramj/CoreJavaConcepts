import java.util.function.BiFunction;

@FunctionalInterface
interface MyRunnable {
    void myRun();
}



public class TypicalClassMethodReference {

    public TypicalClassMethodReference() {
        System.out.println("My Constructor!");
    }

    public static void myCustomStaticRunMethod(){
        System.out.println(" myCustomStaticRunMethod :: Thread is running!" + Thread.currentThread().getName());
    }


    public void myCustomRunMethod(){
        System.out.println(" myCustomRunMethod :: Thread is running!" + Thread.currentThread().getName());
    }

    public void printDetails(){
        System.out.println(" printDetails -> I'm printing my data!");
    }



    public static void displayDetails(){
        System.out.println(" displayDetails -> I'm displaying my data!");
    }

    public static int subtractNumbers(int a, int b){
        System.out.println("Result is "+ (a - b));
        return (a -b);
    }

    public static void main(String[] args) {

        MyRunnable myRunnable = TypicalClassMethodReference::displayDetails;
        myRunnable.myRun();


        Thread thread = new Thread(TypicalClassMethodReference::myCustomStaticRunMethod);
        thread.start();

        Thread thread2 = new Thread(() -> System.out.println("Thread is running --> Lambda way!"));
        thread2.start();

        BiFunction<Integer, Integer, Integer> subtracter = TypicalClassMethodReference::subtractNumbers;
        subtracter.apply(10, 20);


        //---------------Instance Method

        TypicalClassMethodReference typicalClass = new TypicalClassMethodReference();
        Thread thread3 = new Thread(typicalClass::myCustomRunMethod);
        thread3.start();


        MyRunnable myRunnable2 = typicalClass::printDetails;
        myRunnable2.myRun();


        //------------ Constructor

        MyRunnable myRunnable3 = TypicalClassMethodReference::new;
        myRunnable3.myRun();

    }
}


