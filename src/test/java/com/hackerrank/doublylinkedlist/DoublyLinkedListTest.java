/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hackerrank.doublylinkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author eduar
 */
public class DoublyLinkedListTest {

    private final DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    public DoublyLinkedListTest() {
    }

    @BeforeAll
    public static void setUpClass() {

    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
    }

    @DisplayName("Debería insertar un nuevo nodo y debería ser el mismo para Head y Tail.")
    @Test
    public void testInsertNode() {
        doublyLinkedList.insertNode(4);
        assertEquals(4, doublyLinkedList.getHead().getValue());
        assertEquals(4, doublyLinkedList.getTail().getValue());
    }
    
    @DisplayName("Debería eliminar un nodo en head")
    @Test
    public void testDeleteNodeFromHead() {
        doublyLinkedList.insertNode(77);
        doublyLinkedList.insertNode(80);
        doublyLinkedList.deleteNodeFromHead();
        assertNull(doublyLinkedList.getHead().getPrev());
        assertEquals(80, doublyLinkedList.getHead().getValue());
    }
    
    @DisplayName("Debería obtener valores distintos al agregar un nuevo elemento en Head y Tail.")
    @Test
    public void testInsertNewNode() {
        doublyLinkedList.insertNode(6);
        doublyLinkedList.insertNode(89);
        doublyLinkedList.insertNode(999);
        assertEquals(6, doublyLinkedList.getHead().getValue());
        assertEquals(999, doublyLinkedList.getTail().getValue());
    }
    
    @DisplayName("Debería elminiar un nodo de Tail.")
    @Test
    public void testDeleteFromTail() {
        doublyLinkedList.insertNode(77);
        doublyLinkedList.insertNode(89);
        doublyLinkedList.insertNode(988);
        doublyLinkedList.insertNode(178);
        doublyLinkedList.deleteFromTail();
        assertEquals(988, doublyLinkedList.getTail().getValue());
    }
}
