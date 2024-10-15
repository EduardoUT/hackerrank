/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank.datastructures.array;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class ArrrayManipulation {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        int queries = 1;
        List<ArrayList<Long>> array = queries();

        System.out.println(array);
        System.out.println(array.size());
        

    }
    
    public static List<ArrayList<Long>> queries() throws NoSuchAlgorithmException {
        List<ArrayList<Long>> mainArray = new ArrayList();
        ArrayList<Long> randomArray;
        Random rand = SecureRandom.getInstanceStrong();
        for (int i = 0; i < 3; i++) { //<--- Number of queries
            randomArray = new ArrayList<>();
            for (int j = 0; j < 3; j++) { //<--- Number of random elements
                if (j == 2) {
                    long rIntValue = rand.nextInt(10);
                    randomArray.add(j, rIntValue); //<--- Index k in randomArray
                } else {
                    long rLongValue = rand.nextLong();
                    randomArray.add(j, rLongValue); // <--- Index (a, b) in randomArray
                }
            }
            mainArray.add(i, randomArray);
        }
        return mainArray;
    }
    
    
}
