/*
============================================================
Problem: Hours to Minutes
============================================================

Description:
Convert the given hours and minutes into total minutes.

------------------------------------------------------------
Time Conversion Table
------------------------------------------------------------

Day
 ↓ ×24
Hour
 ↓ ×60
Minute
 ↓ ×60
Second
 ↓ ×1000
Millisecond

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

------------------------------------------------------------
Formula
------------------------------------------------------------

Total Minutes = (Hours × 60) + Minutes

Input Format

First Line  : Hours
Second Line : Minutes

Output Format

Print the total number of minutes.

Sample Input
3
45

Sample Output

225

Approach

1. Read hours.
2. Read minutes.
3. Convert hours into minutes.
4. Add the remaining minutes.
5. Print the answer.

------------------------------------------------------------
Time Complexity
------------------------------------------------------------

O(1)

------------------------------------------------------------
Space Complexity
------------------------------------------------------------

O(1)

============================================================
*/


import java.util.*;
public class HoursToMinutes {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int hours = sc.nextInt();
      int mins  = sc.nextInt();


      int totalmins = hours * 60 + mins;
      System.out.print(totalmins);
  } 
}
