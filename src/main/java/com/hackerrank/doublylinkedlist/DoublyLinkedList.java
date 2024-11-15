/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.doublylinkedlist;

/**
 *
 * @author eduar
 */
public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Insert a new node at the head if null and assign tail to te first new
     * node, else insert a new one rigth-next to head and update tail pointer to
     * the new one.
     *
     * @param data
     */
    public void insertNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
    }

    /**
     * This deletes a node from the head.
     */
    public void deleteNodeFromHead() {
        if (head == null) {
            throw new NullPointerException("Lista vacía inserte un nuevo nodo.");
        } else {
            Node temp = head;
            head = temp.getNext();
            head.setPrev(null);
        }
    }

    /**
     * Delet node from Tail.
     */
    public void deleteFromTail() {
        if (this.head == null) {
            throw new NullPointerException("Lista vacía.");
        }

        if (head.getNext() == null) {
            setHead(null);
        } else {
            Node temp = tail;
            tail = temp.getPrev();
            tail.setNext(null);
        }
    }

    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }
}
