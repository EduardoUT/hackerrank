/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.datastructures.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class TwoDimentionsArray {

    public static void main(String[] args) {

        List<List<Integer>> array = new ArrayList();
        ArrayList<Integer> listaInterna = new ArrayList();
        listaInterna.add(1);
        listaInterna.add(1);
        listaInterna.add(1);
        listaInterna.add(0);
        listaInterna.add(0);
        listaInterna.add(0);
        array.add(listaInterna);
        ArrayList<Integer> listaInterna2 = new ArrayList();
        listaInterna2.add(0);
        listaInterna2.add(1);
        listaInterna2.add(0);
        listaInterna2.add(0);
        listaInterna2.add(0);
        listaInterna2.add(0);
        array.add(listaInterna2);
        ArrayList<Integer> listaInterna3 = new ArrayList();
        listaInterna3.add(1);
        listaInterna3.add(1);
        listaInterna3.add(1);
        listaInterna3.add(0);
        listaInterna3.add(0);
        listaInterna3.add(0);
        array.add(listaInterna3);
        ArrayList<Integer> listaInterna4 = new ArrayList();
        listaInterna4.add(0);
        listaInterna4.add(0);
        listaInterna4.add(2);
        listaInterna4.add(4);
        listaInterna4.add(4);
        listaInterna4.add(0);
        array.add(listaInterna4);
        ArrayList<Integer> listaInterna5 = new ArrayList();
        listaInterna5.add(0);
        listaInterna5.add(0);
        listaInterna5.add(0);
        listaInterna5.add(2);
        listaInterna5.add(0);
        listaInterna5.add(0);
        array.add(listaInterna5);
        ArrayList<Integer> listaInterna6 = new ArrayList();
        listaInterna6.add(0);
        listaInterna6.add(0);
        listaInterna6.add(1);
        listaInterna6.add(2);
        listaInterna6.add(4);
        listaInterna6.add(0);
        array.add(listaInterna6);

        int[][] arr = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}};

        int hourGlassNumberElements = 7;
        int maxSum = Integer.MIN_VALUE;
        int centralMatrixElements;
        int arrSize = array.size();
        int counterElementsPattern = 0;
        int centralValueLimit = 0;
        int countBase = 0;
        int aux = 0;
        int sum = 0;

        if (arrSize % 2 != 0 && arrSize > 3) {
            centralMatrixElements = Math.round(arrSize / 2 + 1);
        } else if (arrSize % 2 != 0) {
            centralMatrixElements = Math.round(arrSize / 2);
        } else if (arrSize % 2 == 0 && arrSize > 4) {
            centralMatrixElements = arrSize - 2;
        } else {
            centralMatrixElements = (arrSize / 2);
        }

        for (int i = 0; i < centralMatrixElements; i++) {
            for (int j = 0; j < hourGlassNumberElements; j++) {
                if (counterElementsPattern == hourGlassNumberElements) {
                    counterElementsPattern = 0;
                    j = aux - 1;
                } else {
                    if (countBase <= 2) {
                        sum += array.get(i).get(j) + array.get(i + 2).get(j);
                        counterElementsPattern += 2;
                        countBase++;
                        if (countBase == 2) {
                            aux = j;
                        }
                    } else {
                        centralValueLimit++;
                        sum += array.get(i + 1).get(centralValueLimit);
                        if (sum > maxSum) {
                            maxSum = sum;
                        }

                        sum = 0;
                        countBase = 0;
                        counterElementsPattern++;
                    }
                }

                if (centralValueLimit == centralMatrixElements) {
                    centralValueLimit = 0;
                    counterElementsPattern = 0;
                    break;
                }
            }
        }
        System.out.println(maxSum);
    }
}
