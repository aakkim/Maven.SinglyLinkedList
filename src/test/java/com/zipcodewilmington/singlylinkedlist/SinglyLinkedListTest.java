package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testConstructor() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        //assert the list is not null
        Assert.assertNotNull(llist);
    }

    @Test
    public void testIsEmpty() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        //assert equal if list is head of list is null
        Assert.assertEquals(true, llist.isEmpty());
        Assert.assertTrue(llist.isEmpty());
    }

    @Test
    public void testAdd1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(false, llist.isEmpty());
        Assert.assertFalse(llist.isEmpty());
    }

    @Test
    public void testAdd2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(2);
        Assert.assertEquals(false, llist.isEmpty());
    }

    @Test
    public void testToString() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        String expected = "head -> NULL";
        Assert.assertEquals(expected, llist.toString());
    }

    @Test
    public void testToString2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        String expected = "head -> [1] -> NULL";
        Assert.assertEquals(expected, llist.toString());
    }

    @Test
    public void testToString3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(1);
        String expected = "head -> [1] -> [1] -> NULL";
        Assert.assertEquals(expected, llist.toString());
    }

    @Test
    public void testSize1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertEquals(0, llist.size());
    }

    @Test
    public void testSize2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(1, llist.size());
    }

    @Test
    public void testSize3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(1);
        llist.add(1);
        Assert.assertEquals(3, llist.size());
    }

    @Test
    public void testFind() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertEquals(-1, llist.find(1));
    }

    @Test
    public void testFind2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(0, llist.find(1));
    }

    @Test
    public void testFind3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        Assert.assertEquals(llist.size()-2, llist.find(5));
        Assert.assertEquals(llist.size()-1, llist.find(7));
    }

    @Test
    public void testFind4() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.add(9);
        Assert.assertEquals(llist.size()-1, llist.find(9));
        Assert.assertEquals(0, llist.find(5));
        Assert.assertEquals(1, llist.find(7));
    }

    @Test
    public void testContains() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(true, llist.contains(1));
    }

    @Test
    public void testContains2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        Assert.assertEquals(true, llist.contains(5));
        Assert.assertEquals(true, llist.contains(7));
    }

    @Test
    public void testContains3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(false, llist.contains(41));
    }

    @Test
    public void testGet() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(1, llist.get(0));
    }

    @Test
    public void testGet2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(4);
        llist.add(6);
        Assert.assertEquals(6, llist.get(2));
    }

    @Test
    public void testGet3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertEquals(-1, llist.get(2));
    }
}
