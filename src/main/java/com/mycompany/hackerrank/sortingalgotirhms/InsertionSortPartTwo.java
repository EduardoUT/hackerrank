/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.sortingalgotirhms;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the full version where we are sorting all the elements one by one,
 * this algorithm is O(n^2) since it uses two cicles.
 * 
 * We print each time there is a sort.
 *
 * @author eduar
 */
public class InsertionSortPartTwo {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(7);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(1);
        insertionSort2(arr.size(), arr);
    }

    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++) {
            int unsorted = arr.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j) > unsorted) {
                    swap(arr, j + 1, j);
                } else {
                    break;
                }
            }
            print(arr);
        }
    }

    public static void swap(List<Integer> arr, int indexA, int indexB) {
        int temp = arr.get(indexA);
        arr.set(indexA, arr.get(indexB));
        arr.set(indexB, temp);
    }

    public static void print(List<Integer> arr) {
        String path = "[\\[\\]\\,]";
        String result = arr.toString().replaceAll(path, "");
        System.out.println(result);
    }
}
