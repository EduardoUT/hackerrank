/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.sortingalgotirhms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Insertion sort simple, taking the last value in the array and comparing to
 * the rest of elements, replace the element less than the last elemento stored.
 *
 * We print every time there is a sort.
 *
 * @author eduar
 */
public class InsertionSortPartOne {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        insertionSort1(arr.size(), arr);
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        int unsortedValue = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            int currentValue = arr.get(i);
            if (currentValue < unsortedValue) {
                arr.set(i + 1, unsortedValue);
                print(arr);
                break;
            } else {
                arr.set(i + 1, arr.get(i));
                print(arr);
                if (i == 0) {
                    arr.set(i, unsortedValue);
                    print(arr);
                }
            }
        }
    }

    public static void print(List<Integer> arr) {
        String path = "[\\[\\]\\,]";
        String result = arr.toString().replaceAll(path, "");
        System.out.println(result);
    }
}
