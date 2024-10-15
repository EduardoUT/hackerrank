/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.datastructures.linkedlists.singlylinkedlist;

/**
 *
 * @author eduar
 */
public class Node {

    private int data = 0;
    private Node next;

    public Node(int value) {
        this.data = value;
        next = null;
        SinglyLinkedList.counterNodes();
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }
}
