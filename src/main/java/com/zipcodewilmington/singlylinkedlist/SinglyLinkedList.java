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

    @Override
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

    @Override
    public void remove(int index) throws NullPointerException {
         try {
             if(index == 0) {
                 this.head = head.getNext();
             }
             Node<T> node = head;
             int idx = 0;
             while(node != null && idx < index-1) {
                 node = node.getNext();
                 idx++;
             }

             if(node.getNext().getNext() == null) {
                 node.setNext(null);
             } else {
                 node.setNext(node.getNext().getNext());
             }

         } catch (NullPointerException e) {
             System.out.println("yikes");
         }

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        try {
            if(this.isEmpty()) {return -1;}
            Node<T> temp = head;
            int idx = -1;
            do {
                idx++;
                if(idx == index) {
                    return temp.getData();
                }
                temp = temp.getNext();
            } while (temp != null);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index out of bounds");
        }
        return -1;
    }

    @Override
    public boolean contains(Object data) {
        return (this.find(data) != -1); //if list contains data, it will not return -1
    }

    @Override
    public int find(Object data) {
        if(this.isEmpty()) {return -1;}
        int found = -1; //if we loop through the list and can't find what we are looking for, return -1
        Node<T> temp = head;
        do {
            found++;
            if(temp.getData().equals(data)) {
                return found;
            }
            temp = temp.getNext();
        } while (temp != null);
        return -1; //when we fall out of the loop we return -1 because we didn't find the element
    }

    @Override
    public int size() {

        if(this.isEmpty()) {
            return 0;
        }

        int n = 0;
        Node<T> temp = head;
        do {
            n++;
            temp = temp.getNext();
        } while (temp != null);
        return n;
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
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
                //get next element of list
                temp = temp.getNext();
            } while(temp != null); //if temp is not null
        }
        //add NULL
        sb.append("NULL");
        return sb.toString();
    }
}

//public SinglyLinkedList(){}
//public Boolean isEmpty() {return null;}
