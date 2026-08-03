/*
========================================
Problem: Convert Seconds to DD:HH:MM:SS
File: SecondsToDDHHMMSS.java
========================================

Problem Statement:
Given total seconds, convert them into
Days, Hours, Minutes, and Seconds.

----------------------------------------
Sample Input:
100000

Sample Output:
Days    : 1
Hours   : 3
Minutes : 46
Seconds : 40

01:03:46:40
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

Reverse Conversion

+------------------+----------+
| Conversion       | Formula  |
+------------------+----------+
| Hour → Day       | ÷24      |
| Minute → Hour    | ÷60      |
| Second → Minute  | ÷60      |
| Millisecond → s  | ÷1000    |
+------------------+----------+

Time Conversion Values
----------------------

+----------------+---------------------------+
| Conversion     | Value                     |
+----------------+---------------------------+
| 1 Day          | 24 Hours                  |
| 1 Day          | 1440 Minutes              |
| 1 Day          | 86400 Seconds             |
| 1 Hour         | 60 Minutes                |
| 1 Hour         | 3600 Seconds              |
| 1 Minute       | 60 Seconds                |
| 1 Second       | 1000 Milliseconds         |
+----------------+---------------------------+

------------------------------------------------------------
Formula
------------------------------------------------------------

Days = TotalSeconds / 86400
RemainingSeconds = TotalSeconds % 86400

Hours = RemainingSeconds / 3600
RemainingSeconds = RemainingSeconds % 3600

Minutes = RemainingSeconds / 60
Seconds = RemainingSeconds % 60

----------------------------------------
Pattern:
Time Conversion
Repeated Division + Modulus

Time Complexity : O(1)
Space Complexity: O(1)

========================================
24    → Hours in a day
60    → Minutes in an hour
60    → Seconds in a minute
1000  → Milliseconds in a second
3600  → Seconds in an hour (60 × 60)
*/

import java.util.*;
public class SecondsToDDHHMMSS {
    public static void main(String[] ags){
     Scanner sc = new Scanner(System.in);
     int totalseconds = sc.nextInt();

     int days = totalseconds /86400 ; // or  //total Seconds ÷ 86400, : 86400=24*60*60
     int rem_secs = totalseconds % 86400;

     int hour = rem_secs /3600;          // Remaining Seconds ÷ 3600, where 3600 = 60 × 60
      rem_secs = rem_secs % 3600;        // Remaining seconds after removing complete hours

      int mins = rem_secs / 60 ;
      int secs = rem_secs % 60; 
 

    System.out.printf("%02d:%02d:%02d:%02d", days, hour, mins, secs);
    }
}
