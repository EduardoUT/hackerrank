/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.sortingalgotirhms;

import java.util.ArrayList;
import java.util.List;

/**
 * Countin Sort Part 1.
 *
 * In a separated array count all the occurrences of a value in an unsorted array.
 *
 * @author eduar
 */
public class CountingSortOne {

    public static void main(String[] args) {
        List<Integer> unsorted = new ArrayList<>();
        unsorted.add(1);
        unsorted.add(1);
        unsorted.add(3);
        unsorted.add(2);
        unsorted.add(1);
        for (Integer n : unsorted) {
            System.out.print(n + " ");
        }
        System.out.println("");
        List<Integer> occurrences = countingSort(unsorted);
        System.out.print("[");
        for (Integer n : occurrences) {
            System.out.print(n + " ");
        }
        System.out.print("]");

    }

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> results = new ArrayList<>();
        fillWithZeros(results);
        countOccurrences(results, arr);
        return results;
    }

    public static void fillWithZeros(List<Integer> results) {
        for (int i = 0; i < 100; i++) {
            results.add(0);
        }
    }

    public static void countOccurrences(List<Integer> results, List<Integer> arr) {
        for (int j = 0; j < arr.size(); j++) {
            int valueOfArr = arr.get(j);
            int occurrences = results.get(valueOfArr);
            results.set(valueOfArr, ++occurrences);
        }
    }
}
