/*
========================================
Problem: Convert Days to Hours, Minutes, and Seconds
File: DaysToHoursMinutesSeconds.java
========================================

Problem Statement:
Given the number of days, convert it into
hours, minutes, and seconds.

----------------------------------------
Sample Input:
2

Sample Output:
Hours   : 48
Minutes : 2880
Seconds : 172800

----------------------------------------
Formula:

Hours   = Days × 24
Minutes = Days × 24 × 60
Seconds = Days × 24 × 60 × 60

----------------------------------------
Time Conversion Table

Day → Hour            = ×24
Hour → Minute         = ×60
Minute → Second       = ×60
Second → Millisecond  = ×1000

----------------------------------------
Pattern:
Time Conversion
Multiplication

Time Complexity : O(1)
Space Complexity: O(1)

========================================
*/


import java.util.*;
public class DaysToHoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        
        int hours = days * 24;
        int minutes = days * 24 * 60;      // (hours*60)
        int seconds = days * 24 * 60 * 60; // (minutes*60) 

        System.out.println("Hours : "   + hours);
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + seconds);
    }
}
