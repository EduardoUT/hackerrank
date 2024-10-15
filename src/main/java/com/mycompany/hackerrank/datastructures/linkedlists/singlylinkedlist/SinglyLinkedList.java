/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.datastructures.linkedlists.singlylinkedlist;

/**
 *
 * @author eduar
 */
public class SinglyLinkedList {

    private Node head;
    private static int listSize = 0;

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

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " --> ");
            current = current.getNext();
        }

        System.out.println("null");
    }

    public int length() {
        if (getHead() == null) {
            return 0;
        }
        Node current = getHead();
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.getNext();
        }
        return counter;
    }

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.setNext(getHead());
        head = newNode;
    }

    public void insertAtLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = getHead();
        while (current.getNext() != null) {
            //current = current.next;
            current = current.getNext();
        }
        //current.next = newNode;
        current.setNext(newNode);
    }

    public void insertAtPosition(int position, int value) {
        validateList(position);
        Node node = new Node(value);
        if (position == 1) {
            //node.next = head;
            node.setNext(getHead());
            head = node;
        } else {
            Node current = getHead();
            int count = 1;
            while (count < position - 1) {
                //current = current.next;
                current = current.getNext();
                count++;
            }
            Node previous = current;
            //node.next = previous.next;
            node.setNext(previous.getNext());
            //previous.next = node;
            previous.setNext(node);
        }
    }

    public Node deleteFirstNode() {
        if (getHead() == null) {
            return null;
        }

        Node temp = getHead();
        //head = head.next;
        head = getHead().getNext();
        //temp.next = null;
        temp.setNext(null);
        return temp;
    }

    public Node deleteLastNode() {
        if (getHead() == null || getHead().getNext() == null) {
            return getHead();
        }

        Node current = getHead();
        Node previous = null;
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
        return current;
    }

    public Node deleteNodeAtPosition(int position) {
        validateList(position);
        if (position == 1) {
            head = getHead().getNext();
            return getHead();
        } else {
            Node previous = getHead();
            int count = 1;
            while (count < position - 1) {
                previous = previous.getNext();
                count++;
            }
            Node current = previous.getNext();
            //previous.next = current.next;
            previous.setNext(current.getNext());
            return current;
        }
    }

    public boolean find(int keyValue) {
        if (getHead() == null) {
            return false;
        }
        Node current = getHead();
        while (current.getNext() != null) {
            if (current.getData() == keyValue) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public Node reverse() {
        if (head == null) {
            return head;
        }
        Node current = this.getHead();
        Node previous = null;
        Node next;
        while (current != null) {
            next = current.getNext();
            //current.next = previous;
            current.setNext(previous);
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    public Node findNthValueFromEnd(int n) {
        if (head == null) {
            return null;
        }

        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value for n: " + n);
        }

        Node mainPoniter = head;
        Node secondaryPointer = head;
        int counter = 0;
        while (counter < n) {
            if (secondaryPointer == null) {
                throw new IllegalArgumentException("The given value is invalid "
                        + "for " + size() + " elements in current list.");
            }
            secondaryPointer = secondaryPointer.getNext();
            counter++;
        }

        while (secondaryPointer != null) {
            secondaryPointer = secondaryPointer.getNext();
            mainPoniter = mainPoniter.getNext();
        }

        return mainPoniter;
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null && current.getNext() != null) {
            if (current.getData() == current.getNext().getData()) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
        }
    }

    public Node insertInOrder(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        Node temp = null;
        while (current != null && current.getData() < newNode.getData()) {
            temp = current;
            current = current.getNext();
        }
        newNode.setNext(current);
        temp.setNext(newNode);
        return head;
    }

    private void validateList(int position) {
        if (position > size()) {
            throw new NullPointerException("Cannot insert at position " 
                    + position + " on a Linked List of size " + size());
        }

        if (position <= 0) {
            throw new NullPointerException("Cannot insert at position less "
                    + "than or equal to zero");
        }
    }

    /**
     * @return the listSize
     */
    public int size() {
        return listSize;
    }

    protected static int counterNodes() {
        return listSize++;
    }
}
