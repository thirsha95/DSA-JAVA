/*
 * Program        : HighestAltitude.java
 * Problem        : LeetCode 1732 - Find the Highest Altitude
 *
 * Description    :
 * A biker starts at altitude 0 and travels through n + 1 points.
 * The gain array represents the net altitude change between consecutive points.
 * We compute altitudes using Prefix Sum logic and find the highest altitude reached.
 *
 * ------------------------------------------------------------
 * APPROACH 1 : PREFIX SUM ARRAY (Extra Space O(n))
 * ------------------------------------------------------------
 * Idea:
 * Build an array where each index stores the altitude at that point.
 *
 * Formula:
 * prefix[i] = prefix[i-1] + gain[i-1]
 *
 * Example:
 * gain     = [-5, 1, 5, 0, -7]
 * prefix   = [0, -5, -4, 1, 1, -6]
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * ------------------------------------------------------------
 * APPROACH 2 : RUNNING SUM (OPTIMIZED O(1) SPACE)
 * ------------------------------------------------------------
 * Idea:
 * Instead of storing all prefix values, maintain only current altitude.
 *
 * Formula:
 * altitude += gain[i]
 *
 * Track:
 * highest = max(highest, altitude)
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * ------------------------------------------------------------
 *
 * Sample Input   :
 * gain = [-5, 1, 5, 0, -7]
 *
 * Sample Output  :
 * 1
 *
 * Explanation    :
 * Start altitude = 0
 * Altitudes = [0, -5, -4, 1, 1, -6]
 * Highest altitude = 1
 */
package PrefixSum.Easy;
import java.util.*;
public class HighestAltitude {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] gain = new int[n];
     for(int i=0; i<n; i++){
        gain[i] = sc.nextInt();
     }
     int altitude =0;
     int highest =0;
     for(int num : gain){
        altitude += num;
       highest = Math.max(altitude,highest);
     }
     System.out.println(highest);
    }
}
