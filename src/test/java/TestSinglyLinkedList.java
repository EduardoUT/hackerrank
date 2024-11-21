
import com.hackerrank.singlylinkedlist.SinglyLinkedList;
import com.hackerrank.singlylinkedlist.SinglyLinkedListNode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author eduar
 */
public class TestSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertNode(0);
        singlyLinkedList.insertNode(23);
        singlyLinkedList.insertNode(77);

        singlyLinkedList.printLinkedList(singlyLinkedList.getHead());
        singlyLinkedList.insertNodeAtTail(singlyLinkedList.getHead(), 25);
        singlyLinkedList.printLinkedList(singlyLinkedList.getHead());

        SinglyLinkedListNode newHeadReference = singlyLinkedList.insertNodeAtHead(singlyLinkedList.getHead(), 45);
        singlyLinkedList.setHead(newHeadReference);
        singlyLinkedList.printLinkedList(newHeadReference);

        SinglyLinkedListNode newHead = singlyLinkedList.insertNodeAtPosition(singlyLinkedList.getHead(), 777, 3);
        singlyLinkedList.setHead(newHead);
        singlyLinkedList.printLinkedList(newHead);

        singlyLinkedList.deleteNode(singlyLinkedList.getHead(), 3);
        singlyLinkedList.printLinkedList(singlyLinkedList.getHead());

        singlyLinkedList.reversePrint(singlyLinkedList.getHead());
        System.out.println("");

        SinglyLinkedList newList = new SinglyLinkedList();
        newList.insertNode(45);
        newList.insertNode(0);
        newList.insertNode(23);
        newList.insertNode(77);
        System.out.println(singlyLinkedList.compareLists(singlyLinkedList.getHead(), newList.getHead()));
        System.out.println(singlyLinkedList.compareLists(singlyLinkedList.getHead(), newList.getHead()));

        singlyLinkedList.printLinkedList(singlyLinkedList.reverse(singlyLinkedList.getHead()));
        singlyLinkedList.printLinkedList(singlyLinkedList.reverse(singlyLinkedList.getHead()));
        System.out.println("");

        SinglyLinkedList listA = new SinglyLinkedList();
        listA.insertNode(1);
        listA.insertNode(3);
        listA.insertNode(7);
        listA.printLinkedList(listA.getHead());
        SinglyLinkedList listB = new SinglyLinkedList();
        listB.insertNode(1);
        listB.insertNode(2);
        listB.printLinkedList(listB.getHead());
        SinglyLinkedListNode mergedLists = listA.mergeLists(listA.getHead(), listB.getHead());
        singlyLinkedList.printLinkedList(mergedLists);

        int nodeFromTail = singlyLinkedList.getNode(singlyLinkedList.getHead(), 2);
        System.out.println(nodeFromTail);

        SinglyLinkedList duplicatedLinkedList = new SinglyLinkedList();
        duplicatedLinkedList.insertNode(1);
        duplicatedLinkedList.insertNode(2);
        duplicatedLinkedList.insertNode(2);
        duplicatedLinkedList.insertNode(3);
        duplicatedLinkedList.insertNode(3);
        duplicatedLinkedList.insertNode(3);
        duplicatedLinkedList.insertNode(3);
        duplicatedLinkedList.printLinkedList(duplicatedLinkedList.getHead());
        duplicatedLinkedList.removeDuplicates(duplicatedLinkedList.getHead());
        duplicatedLinkedList.printLinkedList(duplicatedLinkedList.getHead());

        SinglyLinkedListNode firstNode = new SinglyLinkedListNode(1);
        SinglyLinkedListNode secondNode = new SinglyLinkedListNode(2);
        SinglyLinkedListNode thirdNode = new SinglyLinkedListNode(3);
        SinglyLinkedListNode fourthNode = new SinglyLinkedListNode(4);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        thirdNode.setNext(fourthNode);
        fourthNode.setNext(secondNode);

        SinglyLinkedList detectCycle = new SinglyLinkedList();
        detectCycle.setHead(firstNode);
        System.out.println(detectCycle.hasCycle(detectCycle.getHead()));

        //----------------------Detect mergin point
        SinglyLinkedList listX = new SinglyLinkedList();
        SinglyLinkedListNode nodeXOne = new SinglyLinkedListNode(1);
        SinglyLinkedListNode nodeXTwo = new SinglyLinkedListNode(2);
        SinglyLinkedListNode nodeXThree = new SinglyLinkedListNode(3);

        SinglyLinkedList listY = new SinglyLinkedList();
        SinglyLinkedListNode nodeYOne = new SinglyLinkedListNode(1);
        SinglyLinkedListNode nodeYTwo = new SinglyLinkedListNode(44);
        SinglyLinkedListNode nodeYThree = new SinglyLinkedListNode(222);
        SinglyLinkedListNode nodeYFour = new SinglyLinkedListNode(22);
        SinglyLinkedListNode nodeYFive = new SinglyLinkedListNode(233);
        SinglyLinkedListNode nodeYSix = new SinglyLinkedListNode(2245);

        //Mergin two linked lists manually
        nodeXOne.setNext(nodeXTwo);
        nodeXTwo.setNext(nodeXThree);
        nodeXThree.setNext(nodeYThree); // <-- Mergin at index 2

        nodeYOne.setNext(nodeYTwo);
        nodeYTwo.setNext(nodeXThree); // <-- Mergin at index 2
        nodeYThree.setNext(nodeYFour);
        nodeYFour.setNext(nodeYFive);
        nodeYFive.setNext(nodeYSix);

        listX.setHead(nodeXOne);
        listY.setHead(nodeYOne);
        int merginPointDataValueX = listX.findMergeNode(listX.getHead(), listY.getHead());
        System.out.println(merginPointDataValueX);

        int merginPointDataValueY = listY.findMergeNode(listX.getHead(), listY.getHead());
        System.out.println(merginPointDataValueY);

        listX.printLinkedList(listX.getHead());
        listY.printLinkedList(listY.getHead());
    }
}
