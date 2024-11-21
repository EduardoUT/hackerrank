/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.datastructures.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Se consideró ineficiente en las pruebas de HackerRank debido a que tardó 
 * mucho tiempo en ejecutarse en mayor cantidad de valores y rotaciones, 
 * además de hacer un tiempo de ejecución O(n^2) al poseer dos ciclos anidados.
 * @author eduar
 */
public class LeftRotationInefficient {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int arraySize = arr.size();
        int d = 4;
        int lastValueToSwap = 0;

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
        }
        System.out.println(arr);
    }
}
