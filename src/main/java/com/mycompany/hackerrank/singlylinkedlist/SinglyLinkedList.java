/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.singlylinkedlist;

import java.util.Optional;

/**
 * In this LinkedList I include all the excersices with a SinglyLinkedList of
 * HackerRank.
 *
 * @author eduar
 */
public class SinglyLinkedList {

    private SinglyLinkedListNode head;
    private SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(nodeData);
        if (isLinkedListNull()) {
            setHead(singlyLinkedListNode);
        } else {
            getTail().setNext(singlyLinkedListNode);
        }
        setTail(singlyLinkedListNode);
    }

    /**
     * @return the head
     */
    public SinglyLinkedListNode getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(SinglyLinkedListNode head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public SinglyLinkedListNode getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(SinglyLinkedListNode tail) {
        this.tail = tail;
    }

    public boolean isLinkedListNull() {
        return (head == null);
    }

    /**
     * Excercise #1: Print Elements of a LinkedList
     *
     * @param head The pointer of the firs node.
     */
    public void printLinkedList(SinglyLinkedListNode head) {
        if (head == null) {
            throw new NullPointerException("Current LinkedList is null.");
        } else {
            SinglyLinkedListNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getNodeData() + " -> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("NULL");
        }
    }

    /**
     * Excercise #2: Insert a node at the tail of a LinkedList.
     *
     * Before: 141 -> 474 -> 302 -> 164 -> 530 -> NULL
     *
     * Input: Insert 474.
     *
     * After: 141 -> 474 -> 302 -> 164 -> 530 -> 474 -> NULL
     *
     * @param head
     * @param nodeData
     * @return The head with the new element.
     */
    public SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int nodeData) {
        if (head == null) {
            head = new SinglyLinkedListNode(nodeData);
        } else {
            SinglyLinkedListNode currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new SinglyLinkedListNode(nodeData));
        }
        return head;
    }

    /**
     * Excercise #3: Insert a node at the head of a LinkedList.
     *
     * Input: 383 -> NULL
     *
     * Output: 484 -> 383 -> NULL
     *
     * @param llist The head node.
     * @param nodeData
     * @return The reference of the new head node inserted.
     */
    public SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int nodeData) {
        if (llist == null) {
            llist = new SinglyLinkedListNode(nodeData);
        } else {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(nodeData);
            newNode.setNext(llist);
            llist = newNode;
        }
        return llist;
    }

    /**
     * Excercise #4: Insert a node at a specific position in a linked list.
     *
     * Input: 45 -> 0 -> 23 -> 77 -> 25 -> NULL, Data: 777, Position: 3
     *
     * Output: 45 -> 0 -> 23 -> 777 -> 77 -> 25 -> NULL
     *
     * @param llist The currente head reference for traverse this LinkedList
     * @param data
     * @param position The position where the new node will be inserted, it
     * should be 0 indexed.
     * @return The new head reference node.
     */
    public SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode previous = llist;
        for (int i = 0; i < position - 1; i++) {
            previous = previous.getNext();
        }
        SinglyLinkedListNode after = previous.getNext();
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.setNext(after);
        previous.setNext(newNode);
        return llist;
    }

    /**
     * Excercise #5: Delete a Node at a given position.
     *
     * Input: 45 -> 0 -> 23 -> 777 -> 77 -> 25 -> NULL, Position: 3
     *
     * Output: 45 -> 0 -> 23 -> 77 -> 25 -> NULL
     *
     * @param llist
     * @param position
     * @return The reference of the head LinkedList with the removed element.
     */
    public SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if (llist == null) {
            return llist;
        }

        if (position == 0) {
            SinglyLinkedListNode headNode = llist;
            return headNode.getNext();
        }

        SinglyLinkedListNode previousNode = llist;
        for (int i = 0; i < position - 1; i++) {
            previousNode = previousNode.getNext();
        }
        SinglyLinkedListNode deleteNode = previousNode.getNext();
        SinglyLinkedListNode nextNode = deleteNode.getNext();
        previousNode.setNext(nextNode);
        return llist;
    }

    /**
     * Excercise #6: Print in Reverse.
     *
     * Input: 45 -> 0 -> 23 -> 77 -> 25 -> NULL
     *
     * Output: NULL <- 25 <- 77 <- 23 <- 0 <- 45
     *
     * @param llist The LinkedList to reverse.
     */
    public void reversePrint(SinglyLinkedListNode llist) {
        if (llist == null) {
            throw new NullPointerException("Current LinkedList is null");
        }

        SinglyLinkedList reverseLinkedList = new SinglyLinkedList();
        SinglyLinkedListNode currentNode = llist;

        while (currentNode != null) {
            reverseLinkedList.insertNode(currentNode.getNodeData());
            currentNode = currentNode.getNext();
        }

        SinglyLinkedListNode headReverse = reverseLinkedList.getHead();
        SinglyLinkedListNode nextNode;
        SinglyLinkedListNode previous = null;
        System.out.print("NULL");
        while (headReverse != null) {
            System.out.print(" <- " + headReverse.getNodeData());
            nextNode = headReverse.getNext();
            headReverse.setNext(previous);
            previous = headReverse;
            headReverse = nextNode;
        }
    }

    /**
     * Excercise #7: Compare two linked lists.
     *
     * @param head1
     * @param head2
     * @return true if they have same data, otherwise false.
     */
    public boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode nodeA = head1;
        SinglyLinkedListNode nodeB = head2;
        while (nodeA != null && nodeB != null) {
            if (nodeA.getNodeData() != nodeB.getNodeData()) {
                return false;
            } else {
                nodeA = nodeA.getNext();
                nodeB = nodeB.getNext();
            }
        }
        return !(nodeA != null || nodeB != null);
    }

    /**
     * Excercise #8: Reverse a LinkedList.
     *
     * Input: 45 -> 0 -> 23 -> 77 -> 25 -> NULL
     *
     * Output: 25 -> 77 -> 23 -> 0 -> 45 -> NULL
     *
     * To keep the original use after while loop, and execute same method twice:
     *
     * this.setHead(previous);
     *
     * @param llist LinkedList to reverse.
     * @return The reference head node of the reversed LinkedList.
     */
    public SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        if (llist == null) {
            throw new NullPointerException("Current LinkedList is null");
        }

        SinglyLinkedListNode currentNode = llist;
        SinglyLinkedListNode next;
        SinglyLinkedListNode previous = null;
        while (currentNode != null) {
            next = currentNode.getNext();
            currentNode.setNext(previous);
            previous = currentNode;
            currentNode = next;
        }
        this.setHead(previous);
        return previous;
    }

    /**
     * Excercise #9: Merge two sorted linked lists.
     *
     * Input:
     *
     * 1 -> 3 -> 7 -> NULL
     *
     * 1 -> 2 -> NULL
     *
     * Output:
     *
     * 1 -> 1 -> 2 -> 3 -> 7 -> NULL
     *
     * @param head1 First sorted LinkedList to merge.
     * @param head2 Second sorted LinkedList to merge.
     * @return Reference to the head node of the new merged LinkedList.
     */
    public SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedList newList = new SinglyLinkedList();
        SinglyLinkedListNode nodeA = head1;
        SinglyLinkedListNode nodeB = head2;
        while (nodeA != null && nodeB != null) {
            if (nodeA.getNodeData() < nodeB.getNodeData()) {
                newList.insertNode(nodeA.getNodeData());
                nodeA = nodeA.getNext();
            } else {
                newList.insertNode(nodeB.getNodeData());
                nodeB = nodeB.getNext();
            }
        }

        if (nodeA != null) {
            while (nodeA != null) {
                newList.insertNode(nodeA.getNodeData());
                nodeA = nodeA.getNext();
            }
        }

        if (nodeB != null) {
            while (nodeB != null) {
                newList.insertNode(nodeB.getNodeData());
                nodeB = nodeB.getNext();
            }
        }
        return newList.getHead();
    }

    /**
     * Excercise #10: Get Node (From Tail).
     *
     * We have to get a node at a specific position but according to the
     * distance from the tail, not the head, example:
     *
     * Input: 1 -> 3 -> 4 -> 5 -> NULL, Position From Tail: 1
     *
     * Output: 4
     *
     * @param llist LinkedList to het the node data.
     * @param positionFromTail 0 indexed position.
     * @return The node data searched.
     */
    public int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode currentNode = llist;
        SinglyLinkedListNode searchNode = llist;
        int result = -1;
        int length = 0;
        int index;
        while (currentNode != null) {
            currentNode = currentNode.getNext();
            length++;
        }
        index = length - 1;

        while (searchNode != null && index >= 0) {
            if (index == positionFromTail) {
                result = searchNode.getNodeData();
                break;
            } else {
                searchNode = searchNode.getNext();
                index--;
            }
        }
        return result;
    }

    /**
     * Excercise #11: Delete duplicate-value nodes from a sorted linked list
     *
     * Input: 1 -> 2 -> 2 -> 3 -> 3 -> 3 -> 3 -> NULL
     *
     * Output: 1 -> 2 -> 3 -> NULL
     *
     * @param llist The LinkedList to delte duplicated elements.
     * @return The reference to the head node without duplicted elements.
     */
    public SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        if (llist == null) {
            throw new NullPointerException("Current LinkedList is null");
        }

        SinglyLinkedListNode currentNode = llist;
        SinglyLinkedListNode nextNode;
        SinglyLinkedListNode deleteNode;
        while (currentNode.getNext() != null) {
            if (currentNode.getNodeData() == currentNode.getNext().getNodeData()) {
                deleteNode = currentNode.getNext();
                nextNode = deleteNode.getNext();
                currentNode.setNext(nextNode);
            } else {
                currentNode = currentNode.getNext();
            }
        }
        return llist;
    }

    /**
     * Excercise #12: Cycle Detection.
     *
     * Note: For this excersice I use the Floyd Cycle detection algorithm, which
     * consists of use two pointers that will traverse the LinkedList in
     * different steps or velocities, one by one the first and the second two by
     * two, eventually they will point to the same memory location which means
     * that there is a cycle detected.
     *
     * @param head Reference to the head node of a LinkedList to analyse.
     * @return True if the LinkedList has a cycle, otherwise false.
     */
    public boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }

        SinglyLinkedListNode nodeA = head;
        SinglyLinkedListNode nodeB = head;
        while (nodeA != null && nodeB != null) {
            if (nodeB.getNext() != null) {
                nodeA = nodeA.getNext();
                nodeB = nodeB.getNext().getNext();
            } else {
                break;
            }

            if (nodeA == nodeB) {
                return true;
            }
        }
        return false;
    }

    /**
     * Excercise #13: Find Merge Point of Two Lists
     *
     * Note 1: For this excersice its necessary to provide two LinkedList that
     * were merged before.
     *
     * Note 2: To traverse exhaustively the two list in search for the merge
     * point we constanntly check if there is the end of one of the list, if
     * that case we move the pointer to the start of the other linkedlist.
     *
     * We can see if a merge operation has done if both lists with different
     * data share the same node after the merging point.
     *
     * Example:
     *
     * Input:
     *
     * List A
     *
     * 1 -> 2 -> 3 -> NULL
     *
     * List B
     *
     * 1 -> 44 -> 222 -> 22 -> 233 -> 2245 -> NULL
     *
     * Merge point at index 2.
     *
     * 1 -> 2 -> 3
     *
     * 1 -> 44 -> 222 -> 22 -> 233 -> 2245 -> NULL
     *
     * Output: 3
     *
     * Output List A:
     *
     * 1 -> 2 -> 3 -> 222 -> 22 -> 233 -> 2245 -> NULL
     *
     * Output List B:
     *
     * 1 -> 44 -> 3 -> 222 -> 22 -> 233 -> 2245 -> NULL
     *
     * @param head1 First reference to the head LinkedList.
     * @param head2 Second reference to the head LinkedList.
     * @return The node data of the merged point.
     */
    public int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if ((head1 != head2) && (head1 == null || head2 == null)) {
            return -1;
        }

        SinglyLinkedListNode nodeA = head1;
        SinglyLinkedListNode nodeB = head2;
        while (nodeA != nodeB) {
            if (nodeA.getNext() == null) {
                nodeA = head2;
            } else {
                nodeA = nodeA.getNext();
            }

            if (nodeB.getNext() == null) {
                nodeB = head1;
            } else {
                nodeB = nodeB.getNext();
            }
        }
        return nodeA.getNodeData();
    }
}
