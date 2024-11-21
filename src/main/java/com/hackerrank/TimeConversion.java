/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank;

/**
 * Hackos 224
 *
 * @author eduar
 */
public class TimeConversion {

    public static void main(String[] args) {
        final String ANTEMERIDIEM = "AM";
        final String POSTMERIDIEM = "PM";
        String s = "09:05:45PM";
        int hour = Integer.parseInt(s.substring(0, 2));
        String minutesSeconds = s.substring(2, s.length() - 2);
        String res = "";
        int counter;
        int minHour;
        int maxHour;
        
        if (s.contains(ANTEMERIDIEM) || s.contains(POSTMERIDIEM)) {
            if (s.contains(ANTEMERIDIEM)) {
                minHour = 0;
                maxHour = 11;
                counter = 12;
            } else {
                minHour = 12;
                maxHour = 23;
                counter = 12;
            }

            for (int i = minHour; i <= maxHour; i++) {
                if (i == 1 || i == 13) {
                    counter = 1;
                }

                if (hour == counter) {
                    hour = i;
                    if (hour < 10) {
                        res = "0".concat(String.valueOf(hour)).concat(minutesSeconds);
                    } else {
                        res = res.concat(String.valueOf(hour)).concat(minutesSeconds);
                    }
                    break;
                }
                counter++;
            }
        } else {
            throw new Error("Invalid format.");
        }
        
        System.out.println(res);
    }
}
