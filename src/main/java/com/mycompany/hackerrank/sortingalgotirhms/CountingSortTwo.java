/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.sortingalgotirhms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class CountingSortTwo {
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
        
        List<Integer> results = countingSort(unsorted);
        for(Integer n : results) {
            System.out.print(n + " ");
        }
    }
    
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> results = new ArrayList<>();
        fillWithZeros(results);
        countOccurrences(results, arr);
        sort(results, arr);
        return arr;
    }
    
    public static void fillWithZeros(List<Integer> results) {
        for (int i = 0; i < 100; i++) {
            results.add(0);
        }
    }
    
    public static void countOccurrences(List<Integer> results, List<Integer> arr) {
        for(int j = 0; j < arr.size(); j++) {
            int valueOfArr = arr.get(j);
            int occurrences = results.get(valueOfArr);
            results.set(valueOfArr, ++occurrences);
        }
    }
    
    public static void sort(List<Integer> results, List<Integer> arr) {
        int resultsIndex = 0;
        for(int i = 0; i < arr.size(); i++) {
            int occurrences = results.get(resultsIndex);
            if(occurrences == 0) {
                resultsIndex++;
                i--;
            } else {
                arr.set(i, resultsIndex);
                results.set(resultsIndex, --occurrences);
            }
        }
    }
}
