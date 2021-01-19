package com.learning.elite.cafe;


class Animal {
    public void makeSound(){
        System.out.println("The animal makes a sound!");
    }
}

class Cat extends Animal {
    public void makeSound(){
        System.out.println("The cat says: Meow, Meow");
    }
}

class Dog extends  Animal {
    public void makeSound(){
        System.out.println("The cat says: Bow, Bow");
    }
}

public class RuntimePolymorhpism {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myCat = new Cat();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.makeSound();
        myCat.makeSound();
        myDog.makeSound();
    }
}
