package com.learning;
class Parent {

    //Member Variable
    int instVar = 100;

    public Parent(){
    }


    //Member Function
    int addNumbers(int a, int b){
        int result = a + b;
        System.out.println("addNumbers Result : "+ result);
        return result;
    }
}


class MidClass extends Parent {

    private int midVar;

    public MidClass(){
    }
    public MidClass(int var){
        this.midVar = var;
    }

    //Member Function
    int subtractNumbers(int a, int b){
        int result = a + b;
        System.out.println("subtractNumbers Result : "+ result);
        return result;
    }
}

class Child extends MidClass {

    int childVar;
    public Child(int var){
        this.childVar = var;
    }

    public static void main(String args[]){
        Child child = new Child(100);
        child.addNumbers(10, 20);
        child.subtractNumbers(50, 20);
        System.out.println("Variable is "+ child.instVar);
    }
}


public class InheritenceTest {
}
