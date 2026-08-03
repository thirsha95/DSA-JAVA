/*
========================================
Problem: Convert HH:MM:SS to Total Seconds
========================================

Problem Statement:
Given hours, minutes, and seconds,
convert them into total seconds.

----------------------------------------
Sample Input:
2 3 4

Sample Output:
7384
------------------------------------------------------------
Time Conversion Table
------------------------------------------------------------

+------------------+----------+
| Conversion       | Formula  |
+------------------+----------+
| Day → Hour       | ×24      |
| Hour → Minute    | ×60      |
| Minute → Second  | ×60      |
| Second → ms      | ×1000    |
+------------------+----------+

Time Conversion Values
----------------------
+----------------+---------------------------+
| Conversion     | Formula                   |
+----------------+---------------------------+
| 1 Day          | 24 Hours                  |
| 1 Day          | 1440 Minutes              |
| 1 Day          | 86400 Seconds             |
| 1 Hour         | 60 Minutes                |
| 1 Hour         | 3600 Seconds              |
| 1 Minute       | 60 Seconds                |
| 1 Second       | 1000 Milliseconds         |
+----------------+---------------------------+


----------------------------------------
Formula:

Total Seconds =
(Hours × 3600) +
(Minutes × 60) +
Seconds

----------------------------------------
Pattern:
Time Conversion
Multiplication

Time Complexity : O(1)
Space Complexity: O(1)
========================================
*/

import java.util.*;
public class HHMMSSToSeconds {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();

        int totalseconds = (hours * 60 *60) + (minutes * 60) + seconds;
        System.out.print(totalseconds);
    }
}
