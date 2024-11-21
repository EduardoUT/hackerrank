/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * On this excersice we are given a list of strings, that contains the next
 * operations:
 *
 * 1 x - Push a new element on the stack being x some integer value.
 *
 * 2 - Pop an element on the stack.
 *
 * 3 - Get the maximum value on the stack.
 *
 * Return:
 *
 * An integer list of the max elements after execute all the operations.
 *
 * Learned lessons:
 *
 * For first try I implemented a LinkedList to represent a Stack, the tests that
 * pass were 9 of 27 this due to the cost of access a value in the function
 * getMax of the stack being O(n), for a better solution I implemented a Array
 * being O(1) to access the values and less time for comparitions.
 *
 * @author eduar
 */
public class FindMax {

    private FindMax() {
        throw new IllegalStateException("Utility class.");
    }

    private static final char PUSH_OPERATION = '1';
    private static final char POP_OPERATION = '2';
    private static final char MAX_OPERATION = '3';

    public static List<Integer> getMax(List<String> operations) {
        List<Integer> result = new ArrayList<>();
        char valueOperation;
        int arrSize = 0;
        for (String operation : operations) {
            valueOperation = operation.charAt(0);
            if (valueOperation == PUSH_OPERATION) {
                arrSize++;
            }
        }
        Stack stack = new Stack(arrSize);
        int maxElement;
        for (String operation : operations) {
            valueOperation = operation.charAt(0);
            switch (valueOperation) {
                case PUSH_OPERATION:
                    int value = Integer.parseInt(operation.substring(2));
                    stack.push(value);
                    break;
                case POP_OPERATION:
                    stack.pop();
                    break;
                case MAX_OPERATION:
                    maxElement = stack.getMax();
                    result.add(maxElement);
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}

class Stack {

    private int top;
    private final int[] arrayStack;
    private int maxValue;

    Stack(int size) {
        top = -1;
        arrayStack = new int[size];
        maxValue = Integer.MIN_VALUE;
    }

    public void push(int value) {
        arrayStack[++top] = value;
    }

    public void pop() {
        if (arrayStack[top] == maxValue) {
            maxValue = Integer.MIN_VALUE;
        }
        top--;
    }

    public int getMax() {
        for (int i = top; i >= 0; i--) {
            if (arrayStack[i] >= maxValue) {
                maxValue = arrayStack[i];
            }
        }
        return maxValue;
    }
}
