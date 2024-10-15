/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.datastructures.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Se considera eficiente al poseer solo un ciclo y calcular directamente
 * la posición final de los valores acorde al número de rotaciones solicitadas.
 * El tiempo de ejecución es de: O(n)
 * @author eduar
 */
public class LeftRotationEfficient {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int arraySize = arr.size();
        int d = 4;
        int substraction;
        int array[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            int res;
            substraction = i - d;

            if (substraction < 0) {
                res = arraySize - Math.abs(substraction);
                array[res] = arr.get(i);
            } else {
                array[substraction] = arr.get(i);
            }
        }
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println(arr);
        System.out.println(1%5);
    }
}
