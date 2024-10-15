/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Hackos 219
 *
 * @author eduar
 */
public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        /*
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
         */
 
        int arrSize = arr.size();
        long minSum;
        long maxSum;
        long res;
        long array[] = new long[5];

        for (int i = 0; i < arrSize; i++) {
            res = 0;
            for (int j = 0; j < arrSize; j++) {
                if (j == i) {
                    j++;
                }

                if (j < arrSize) {
                    res += arr.get(j);
                } else {
                    break;
                }
            }
            array[i] = res;
        }

        maxSum = array[0];
        minSum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                long nextValue = array[i + 1];
                if (nextValue > maxSum) {
                    maxSum = nextValue;
                }

                if (nextValue < minSum) {
                    minSum = nextValue;
                }
            }
        }

        System.out.println(minSum + " " + maxSum);

        for (Long i : array) {
            System.out.println(i);
        }
    }
}
