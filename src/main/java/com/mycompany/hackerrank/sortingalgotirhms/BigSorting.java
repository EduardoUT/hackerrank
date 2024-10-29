/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.sortingalgotirhms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given an arrzy of strings with the representation of an integer value, sort
 * them in ascendent order.
 *
 * What I learn:
 *
 * 1. Insetad of build my own QuickSort method with random pivot which its the
 * most stable and quick known by beginners it is not quite efficent because we
 * use BigInteger for very biggest numbers that makes more inefficient our
 * solution, so we use the build-in by Java Arrays.sort(Object[]) that have an
 * implementation of MergeSort.
 *
 * 2. We can use some methods of Integer and String classes to compare and
 * evaluate the size of biggest numbers insetead of utilize BigInteger.
 *
 * Input:
 *
 * ["5", "4", "2", "10", "8"]
 *
 *
 * Output:
 *
 * ["2", "4", "5", "8", "10"]
 *
 * @author eduar
 */
public class BigSorting {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("8");
        arr.add("1");
        arr.add("2");
        arr.add("100");
        arr.add("12303479849857341718340192371");
        arr.add("3084193741082937");
        arr.add("3084193741082938");
        arr.add("111");
        arr.add("200");
        System.out.println(arr);
        System.out.println(bigSorting(arr));
    }

    /**
     *
     * @param unsorted List of unsorted strings.
     * @return The sorted list.
     */
    public static List<String> bigSorting(List<String> unsorted) {
        String[] unsortedStrings = unsorted.toArray(new String[0]);
        Arrays.sort(unsortedStrings, BigSorting::compareStrings);
        return Arrays.asList(unsortedStrings);
    }

    /**
     * This is an implementation to sort two Strings by length or content by
     * using a personalized Comparator.
     *
     * @param a First String to evaluate.
     * @param b Second String to evaluate.
     * @return If both have the same length, they will be compared
     * lexicographically, wich means each character. If they are not the same
     * length, they will be compared by which of them will be the longest.
     */
    public static int compareStrings(String a, String b) {
        if (a.length() == b.length()) {
            return a.compareTo(b);
        } else {
            return Integer.compare(a.length(), b.length());
        }
    }
}
