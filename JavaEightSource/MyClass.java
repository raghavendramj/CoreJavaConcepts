@FunctionalInterface
interface Test {
    void print();

    default int add(int a, int b){
        System.out.println("Test. add");
        System.out.println("Result is "+ (a + b));
        return (a + b);
    }

    default int muliply(int a, int b){
        System.out.println("Test. muliply");
        System.out.println("Result is "+ (a * b));
        return (a * b);
    }

    static int subtract(int a, int b){
        System.out.println("Test. subtract");
        System.out.println("Result is "+ (a - b));
        return (a - b);
    }
}

class MyClass implements Test {
    public int add(int a, int b){
        System.out.println("MyClass. add");
        System.out.println("Result is "+ (a + b));
        return (a + b);
    }


    public void print(){
        System.out.println("I'm printing!");
    }

    public static void main(String args[]){
        Test test = new MyClass();
        test.print();
        test.add(12, 2);
        test.muliply(6 , 6);

    }
}