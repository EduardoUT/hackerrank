/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hackerrank;

import java.util.Arrays;

/**
 *
 * @author eduar
 */
public class PlusMinus {

    public static void main(String[] args) {

        /*
          71
        
        Zeros: 7
        Neg: 35
        Pos: 29
          -92 -21 -93 -27 -45 -63 53 45 0 6 -67 84 96 86 18 36 53 0 47 88 
          91 -59 65 62 3 13 0 -49 -47 94 -63 65 -23 48 -5 0 -10 67 -23 19 
          -11 46 80 -83 0 -40 74 -63 -20 -72 98 -72 66 0 -58 -1 67 -22 8 
          -45 32 -65 0 -10 -65 -81 -36 -55 -99 -18 -82
        
        6
        Pos: 3
        Neg: 2
        Zer: 1
        -4 3 -9 0 4 1
        
        8
        Pos: 3
        Neg: 3
        Zer: 2
        1 2 3 -1 -2 -3 0 0
        
         */
        int dividend = 2;
        int divisor = 8;
        int multiplicatorLimit = 0;
        int res = 0;
        int aux;
        int remainder;
        String[] quotient = new String[8];

        if (dividend < divisor) {
            dividend *= 10;
            remainder = dividend;
            quotient[0] = "0";
            quotient[1] = ".";

            for (int i = 2; i < quotient.length; i++) {
                for (int k = 1; k <= 10; k++) {
                    aux = divisor * k;
                    if (aux <= remainder) {
                        multiplicatorLimit = k;
                        res = aux;
                    } else {
                        if (remainder == 0) {
                            quotient[i] = String.valueOf(remainder);
                        } else {
                            remainder -= res;
                            remainder *= 10;
                            quotient[i] = String.valueOf(multiplicatorLimit);
                            if (divisor > remainder) {
                                multiplicatorLimit = 0;
                                remainder *= 10;
                                i++;
                                quotient[i] = String.valueOf(multiplicatorLimit);
                            }
                        }
                        break;
                    }
                }
            }

            int lastDecimal = Integer.parseInt(quotient[quotient.length - 1]);
            if (lastDecimal >= 5) {
                lastDecimal += 1;
                quotient[quotient.length - 1] = String.valueOf(lastDecimal);
            } else {
                for (int i = 1; i <= 10; i++) {
                    aux = divisor * i;
                    if (aux <= remainder) {
                        multiplicatorLimit = i;
                    } else {
                        break;
                    }
                }

                if (multiplicatorLimit >= 5) {
                    lastDecimal += 1;
                    quotient[quotient.length - 1] = String.valueOf(lastDecimal);
                }
            }
        } else if (dividend == divisor) {
            for (int i = 0; i < quotient.length; i++) {
                switch (i) {
                    case 0:
                        quotient[i] = String.valueOf(1);
                        break;
                    case 1:
                        quotient[i] = ".";
                        break;
                    default:
                        quotient[i] = String.valueOf(0);
                        break;
                }
            }
        } else {
            throw new ArithmeticException("Oops... not a decimal divition :( ");
        }

        for (String string : quotient) {
            System.out.print(string);
        }
    }
}
