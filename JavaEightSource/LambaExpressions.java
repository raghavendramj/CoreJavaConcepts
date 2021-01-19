import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface FunctionalInterfaceTest {
    int add(int a, int b);
}


interface PrintStatements {
    void print();
}


public class LambaExpressions {

    public static void main(String[] args) {

        // Anonymous Class
        FunctionalInterfaceTest test = new FunctionalInterfaceTest() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(test.add(10, 20));


        // Lambda Expression
        FunctionalInterfaceTest test2 = (a, b) -> {
            return a + b;
        };
        System.out.println(test2.add(10, 20));


        FunctionalInterfaceTest test3 = (a, b) -> a + b;
        System.out.println(test3.add(10, 20));


        PrintStatements statements1 = () -> {
            System.out.println(" Hey I'm printing - One Line!");
            System.out.println(" Hey I'm printing - Line two");
        };
        statements1.print();


        PrintStatements statements2 = () -> System.out.println(" Hey I'm printing!");
        statements2.print();


        final String fruits[] = {"Orange", "Banana", "Mango", "Watermelon", "Apple"};
        System.out.println("\n ------------------- ");
        List<String> fruitsSecondList = Arrays.asList(fruits);
        fruitsSecondList.forEach((n) -> System.out.print(n + " "));
        System.out.println("\n -------------------");

        Runnable runnable = () -> {
            System.out.println("\nInside RUN!... Hey I'm Thread 1");
        };

        Thread java8Thread = new Thread(runnable);
        java8Thread.start();


        Thread java8Thread2 = new Thread(() -> System.out.println("Inside RUN!... Hey I'm Thread 2 "));
        java8Thread2.start();


        new Thread(() -> System.out.println("Inside RUN!... Hey I'm Thread 3 ")).start();

    }
}
