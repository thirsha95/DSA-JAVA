/*
========================================
Problem: Convert Hours to Days and Remaining Hours
File: HoursToDaysHours.java
========================================

Problem Statement:
Given total hours, convert them into
days and remaining hours.

----------------------------------------
Sample Input:
50

Sample Output:
Days : 2
Hours : 2

----------------------------------------
Formula:

Days = TotalHours / 24
Remaining Hours = TotalHours % 24

----------------------------------------
Time Conversion Table

Day → Hour            = ×24
Hour → Minute         = ×60
Minute → Second       = ×60
Second → Millisecond  = ×1000

Reverse Conversion

Hour → Day            = ÷24
Minute → Hour         = ÷60
Second → Minute       = ÷60
Millisecond → Second  = ÷1000

----------------------------------------
Pattern:
Time Conversion
Division + Modulus

Time Complexity : O(1)
Space Complexity: O(1)

========================================
*/


import java.util.*;
public class HoursToDaysHours {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int totalhours = sc.nextInt();

      int days = totalhours / 24 ;
      int rem_hours = totalhours % 24 ;

      System.out.println("days : " + days );
      System.out.println("hours : "+ rem_hours);
  }  
}
