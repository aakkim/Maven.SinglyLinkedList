package com.zipcodewilmington.singlylinkedlist;

public class Node<T> { //if we take out public and copy this code as an inner class in SinglyLinkedList

    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data) { //create a node, don't care about the next node and set to null
        this.data = data;
        this.next = null;
        // this(data,null); <- is the same thing
        //we already have a constructor, so we call that constructor
        // one argument is provided and we assign it, the other we set to null;
    }

    public T getData() { return data; }

    public Boolean hasNext() {
        return this.next != null;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }
}
