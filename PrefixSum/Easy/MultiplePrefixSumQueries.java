/*
 * Program       : MultipleSumQueries.java
 * Problem       : Multiple Sum Queries Using Prefix Sum
 * Description   : Build a prefix sum array once and answer multiple queries for the sum of the first K elements in O(1) time per query.
 *
 * Sample Input  :
 * n = 5
 * arr = [2, 4, 1, 6, 3]
 * queries = [2, 4, 5]
 *
 * Sample Output :
 * Query(2) = 6
 * Query(4) = 13
 * Query(5) = 16
 */
package PrefixSum.Easy;
import java.util.*;
public class MultiplePrefixSumQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
         //logic
        int[] prefixsum = new int[n];
        prefixsum[0] =  arr[0];
        for(int i=1; i<n; i++){
            prefixsum[i]=prefixsum[i-1]+arr[i];
        }
        
        int queries = sc.nextInt();
        for(int i=0; i<queries; i++){
            int k = sc.nextInt();
          int ans = prefixsum[k-1];
        System.out.println("The sum of first " + k + " elements is: " + ans);        }
        
    }
}
