/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.singlylinkedlist;

/**
 *
 * @author eduar
 */
public class SinglyLinkedListNode {

    private int nodeData;
    private SinglyLinkedListNode next;
    private boolean isCurrentNodeNull = true;

    public SinglyLinkedListNode(int nodeData) {
        setIsCurrentNodeNull(false);
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

    /**
     * @return the isCurrentNodeNull
     */
    public boolean isIsCurrentNodeNull() {
        return isCurrentNodeNull;
    }

    /**
     * @param isCurrentNodeNull the isCurrentNodeNull to set
     */
    private void setIsCurrentNodeNull(boolean isCurrentNodeNull) {
        this.isCurrentNodeNull = isCurrentNodeNull;
    }
}
