package com.learning.collections;

class Node{

    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}


public class BasicLinkedList {

    Node head;

    //Inserting an element

    //Deleting an element

    //Accessing an element



    public static void main(String[] args) {

        BasicLinkedList list = new BasicLinkedList();


        Node first = new Node(10);

        Node second = new Node(20);
        first.next = second;

        Node third = new Node(30);
        second.next = third;

        Node fourth = new Node(40);
        fourth.next = null;


        // 10 -> 20 -> 30 -> 40





    }

}
