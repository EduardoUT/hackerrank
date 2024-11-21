/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.sortingalgotirhms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This sorting algorithm takes the index 0 as the pivot in every recursive call
 * so that let us to sort all the numbers less than pivot in the left side of the array,
 * all the numbers greater than pivot in the right side and all the numbers equals to 
 * the pivot in left or right to the pivot like the next example:
 * Input:
 * [4, 5, 3, 7, 2]
 * Output after quickSort(arr):
 * [2, 3, 4, 7, 5]
 * 
 * Input:
 * [4, 5, 4, 7, 2]
 * Output after quickSort(arr):
 * [2, 4, 4, 7, 5]
 * 
 * @author eduar
 */
public class QuickSortPartition {

    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(1000));
        }
        for (Integer number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
        quickSort(randomNumbers);
        for (Integer number : randomNumbers) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        quickSort(arr, 0, arr.size() - 1);
        return arr;
    }

    public static void quickSort(List<Integer> arr, int low, int high) {
        if (low < high) {
            int leftPointer = partition(arr, low, high);
            quickSort(arr, low, leftPointer - 1);
            quickSort(arr, leftPointer + 1, high);
        }
    }

    public static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(0);
        int leftPointer = low;
        for (int i = leftPointer + 1; i <= high; i++) {
            if(arr.get(i) < pivot || arr.get(i) == pivot) {
                leftPointer++;
                swap(arr, i, leftPointer);
            }
        }
        swap(arr, low, leftPointer);
        return leftPointer;
    }

    public static void swap(List<Integer> arr, int indexA, int indexB) {
        int temp = arr.get(indexA);
        arr.set(indexA, arr.get(indexB));
        arr.set(indexB, temp);
    }
}
