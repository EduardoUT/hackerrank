/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.datastructures.linkedlists.singlylinkedlist;

/**
 *
 * @author eduar
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList sL = new SinglyLinkedList();
        sL.insertAtBeginning(3);
        sL.insertAtBeginning(3);
        sL.insertAtBeginning(1);
        sL.insertAtBeginning(1);
        /*
        Node firstNode = new Node(13);
        Node secondNode = new Node(23);
        Node thirdNode = new Node(56);
        Node fourthNode = new Node(100);
        
        sL.setHead(new Node(67));
        sL.getHead().setNext(firstNode);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        thirdNode.setNext(fourthNode);*/

 /*
        sL.insert(1, 23);
        sL.insert(1, 33);
        sL.insert(2, 11);
        sL.insert(4, 35);
         */
        //sL.deleteNodeAtPosition(2);
        sL.removeDuplicates();
        sL.printList();
        sL.insertInOrder(2);
        sL.printList();
        System.out.println(sL.length());
        //sL.reverse();
        //sL.printList();
        //System.out.println(sL.length());
        //System.out.println(sL.size());
        //System.out.println(sL.findNthValueFromEnd(4).getData());

        //LinkedList lista = new LinkedList();
    }
}
