/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 *
 * @author eduar
 */
public class BgDecimalTest {
    public static void main(String[] args) {
        int dividend = 2;
        int divisor = 8;
        
        BigDecimal dividendDecimal = new BigDecimal(String.valueOf(dividend));
        BigDecimal divisorDecimal = new BigDecimal(String.valueOf(divisor));
        BigDecimal result = dividendDecimal.divide(divisorDecimal, 6, RoundingMode.HALF_UP);
        System.out.println(result);
    }
}
