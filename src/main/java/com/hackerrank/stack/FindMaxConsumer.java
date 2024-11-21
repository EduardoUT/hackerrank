/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class FindMaxConsumer {
    
    public static void main(String[] args) {
        String ruta = "src/main/java/com/hackerrank/stack/resources/values.txt";
        List<Integer> resultado = FindMax.getMax(readFile(ruta));
        resultado.remove(0);
        for(Integer maxValue : resultado) {
            System.out.println(maxValue);
        }
    }
    
    public static List<String> readFile(String path) {
        List<String> values = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while((linea = br.readLine()) != null) {
                values.add(linea);
            }
        } catch(IOException e) {
            e.getMessage();
        }
        return values;
    }
}
