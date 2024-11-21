/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.singlylinkedlist;

/**
 *
 * @author eduar
 */
public class SinglyLinkedListNode {

    private int nodeData;
    private SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.nodeData = nodeData;
        this.next = null;
    }

    /**
     * @return the nodeData
     */
    public int getNodeData() {
        return nodeData;
    }

    /**
     * @param nodeData the nodeData to set
     */
    public void setNodeData(int nodeData) {
        this.nodeData = nodeData;
    }

    /**
     * @return the next
     */
    public SinglyLinkedListNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }
}
