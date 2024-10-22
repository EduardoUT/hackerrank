/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.sortingalgotirhms;

import java.util.ArrayList;
import java.util.List;

/**
 * The challenge is given an array of 2D Dimentions, in every sub-List are two
 * values a[x] the representation of a integer number and a[y] the
 * representation of a string with tange [a-Z].
 *
 * The final result is to print the words int a[y] taking by reference the value
 * of a[x].
 *
 * But it´s required to replace with a sign '-' the first half of the array.
 *
 * Challenges resolving it:
 *
 * 1. When there are too many inputs in the System.out.println() It creates
 * implicity Strings, that makes more slow the print() function so instead of
 * that I used StringBuilder, and then print the final stringBuilder.
 *
 * @author eduar
 */
public class CountingSortFull {

    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();
        List<String> subOne = new ArrayList<>();
        subOne.add("1");
        subOne.add("e");
        List<String> subTwo = new ArrayList<>();
        subTwo.add("2");
        subTwo.add("a");
        List<String> subThree = new ArrayList<>();
        subThree.add("1");
        subThree.add("b");
        List<String> subFour = new ArrayList<>();
        subFour.add("3");
        subFour.add("a");
        List<String> subFive = new ArrayList<>();
        subFive.add("4");
        subFive.add("f");
        List<String> subSix = new ArrayList<>();
        subSix.add("1");
        subSix.add("f");
        List<String> subSeven = new ArrayList<>();
        subSeven.add("2");
        subSeven.add("a");
        List<String> subEight = new ArrayList<>();
        subEight.add("1");
        subEight.add("e");
        List<String> subNine = new ArrayList<>();
        subNine.add("1");
        subNine.add("b");
        List<String> subTen = new ArrayList<>();
        subTen.add("1");
        subTen.add("c");
        arr.add(subOne);
        arr.add(subTwo);
        arr.add(subThree);
        arr.add(subFour);
        arr.add(subFive);
        arr.add(subSix);
        arr.add(subSeven);
        arr.add(subEight);
        arr.add(subNine);
        arr.add(subTen);
        System.out.println(arr);
        countSort(arr);
    }

    public static void countSort(List<List<String>> arr) {
        replaceHalfArrayWithMinusSign(arr);
        List<List<String>> sortedArray = new ArrayList<>();
        fillVoidArrays(sortedArray, 100);
        sort(arr, sortedArray);
        print(sortedArray);
    }

    public static void replaceHalfArrayWithMinusSign(List<List<String>> arr) {
        for (int i = 0; i < arr.size() / 2; i++) {
            arr.get(i).set(1, "-");
        }
    }

    /**
     *
     * @param sortedArray
     * @param numArrays 100 Since thats the maximum integer number in a[x]
     */
    public static void fillVoidArrays(List<List<String>> sortedArray, int numArrays) {
        for (int i = 0; i < numArrays; i++) {
            sortedArray.add(new ArrayList<>());
        }
    }

    public static void sort(List<List<String>> arr, List<List<String>> sortedArray) {
        for (int i = 0; i < arr.size(); i++) {
            int numericValue = Integer.parseInt(arr.get(i).get(0));
            String stringValue = String.valueOf(arr.get(i).get(1));
            sortedArray.get(numericValue).add(stringValue);
        }
    }

    public static void print(List<List<String>> sortedArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sortedArray.size(); i++) {
            for (int j = 0; j < sortedArray.get(i).size(); j++) {
                stringBuilder.append(sortedArray.get(i).get(j)).append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}
