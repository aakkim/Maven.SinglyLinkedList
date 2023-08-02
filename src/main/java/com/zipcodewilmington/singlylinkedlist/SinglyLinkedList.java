package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
/*

 */
public class SinglyLinkedList<T> implements LinkedListIface {

    private Node<T> head = null; //the first node/element in list
    public SinglyLinkedList() {}

    public Boolean isEmpty() { //standard Collection method
        return head == null; //return true if head is null. if head is null, list is empty
    }

    @java.lang.Override
    public void add(Object data) { //to add an element, find null and then add element
        Node<T> newNode = new Node(data); //create new node
        if(this.head == null) {
            //if head is null then set value of the element to head
            this.head = newNode;
        } else {
            // else set temp node to head
            Node<T> temp = head;
            //check if there is a next node. if there is, assign temp to the next node
            while(temp.hasNext()) {
                temp = temp.getNext();
            }
            // once the .hasNext() hits a null, temp is null so we set it to the newNode
            temp.setNext(newNode);
        }

    }

    @java.lang.Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @java.lang.Override
    public java.lang.Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @java.lang.Override
    public boolean contains(java.lang.Object data) {
        return false;
    }

    @java.lang.Override
    public int find(java.lang.Object data) {
        return 0;
    }

    @java.lang.Override
    public int size() {
        return 0;
    }

    @java.lang.Override
    public SinglyLinkedList copy() {
        return null;
    }

    @java.lang.Override
    public void sort(Comparator comparator) {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //add head
        sb.append("head -> ");
        //if head is null, we don't iterate through list. else we loop through and print each data/element
        if(head != null) {
            Node<T> temp = head;
            do { //loop will run once and then check if temp is null or has next
                //print the data/element
                sb.append("[" + temp.getData() + "] -> ");
                temp = temp.getNext();
            } while(temp != null); // && (temp.hasNext())); //if temp is not null and has a next that's not null
        }
        //add NULL
        sb.append("NULL");
        return sb.toString();
    }
}

//public SinglyLinkedList(){}
//public Boolean isEmpty() {return null;}
