/*
========================================
Problem: Convert Seconds to HH:MM:SS
File: SecondsToHHMMSS.java
========================================

Problem Statement:
Given a time duration in seconds, convert it into
HH:MM:SS (Hours : Minutes : Seconds) format.

----------------------------------------
Sample Input:
7384

Sample Output:
02:03:04
----------------------------------------

Approach:
1. Find hours using totalSeconds / 3600.
2. Find remaining seconds using totalSeconds % 3600.
3. Find minutes using remainingSeconds / 60.
4. Find seconds using remainingSeconds % 60.
5. Print using two-digit formatting (%02d).

----------------------------------------
Key Formula:

Hours   = TotalSeconds / 3600
RemainingSeconds = TotalSeconds % 3600

Minutes = RemainingSeconds / 60
Seconds = RemainingSeconds % 60

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
Pattern:
Time Conversion
Division + Modulus
Formatting (%02d)

Time Complexity : O(1)
Space Complexity: O(1)

========================================
*/
import java.util.*;
public class SecondsToHHMMSS {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int seconds = sc.nextInt();

    int hours = seconds / 3600 ;
    int remseconds = seconds % 3600;

    int mins = remseconds / 60;
    int secs = remseconds % 60;

    System.out.printf("%02d:%02d:%02d",hours, mins,secs);


    }
}
