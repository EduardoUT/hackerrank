/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.datastructures.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class LeftRotationEfficient1 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int arraySize = arr.size();
        int d = 4;
        int aux = 0;
        int substraction;
        int array[] = new int[arraySize];
        int last = 0;

        for (int i = 0; i < arraySize; i++) {
            int res;
            substraction = i - d;

            if (i == arraySize - 1) {
                arr.set(i, last);
            }

            if (i == 4) {
                last = arr.get(i);
            } else {
                if (substraction < 0) {
                    res = arraySize - Math.abs(substraction);

                    aux = arr.get(i);
                    arr.set(i, arr.get(res));
                    arr.set(res, aux);
                    System.out.println(i + " " + res);
                    //array[res] = arr.get(i);
                } else {
                    aux = arr.get(i);
                    arr.set(i, arr.get(substraction));
                    arr.set(substraction, aux);
                    //array[substraction] = arr.get(i);
                }
            }

            //System.out.println(arr);
        }
        /*
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < arraySize; j++) {
                int aux;
                int currentValue = arr.get(j);
                if (j == arraySize - 1) {
                    arr.set(j, lastValueToSwap);
                    break;
                } else {
                    if (j == 0) {
                        lastValueToSwap = arr.get(j);
                    } else {
                        aux = currentValue;
                        arr.set(j, arr.get(j + 1));
                        arr.set(j - 1, aux);
                    }
                }
            }
        }*/
 /*
        for (int i : array) {
            System.out.println(i);
        }*/

        System.out.println(arr);
    }
}
