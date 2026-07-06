/*
 * Program       : LeftAndRightSumDifferences.java
 * Problem       : LeetCode 2574 - Left and Right Sum Differences
 * Description   : Given a 0-indexed integer array nums, return an array answer
 *                 where answer[i] = |leftSum[i] - rightSum[i]|.
 *
 *                 leftSum[i]  = Sum of elements before index i.
 *                 rightSum[i] = Sum of elements after index i.
 *
 *                 Uses the Prefix Sum / Running Sum technique to compute
 *                 left and right sums efficiently in O(n) time.
 *
 * Sample Input  :
 * nums = [10, 4, 8, 3]
 *
 * Sample Output :
 * [15, 1, 11, 22]
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)   // O(1) extra if output array is excluded
 */
package PrefixSum.Easy;
import java.util.*;
public class LeftAndRightSumDifferences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int[] res = new int[n];
        leftsum[0]= 0;
        for(int i=1; i<n; i++){
            leftsum[i] = leftsum[i-1] + arr[i-1];
        }

        rightsum[n-1]=0;
        for(int i=n-2; i>=0; i--){
         rightsum[i] = rightsum[i+1]+arr[i+1];
        }
         
        for(int i=0; i<n; i++){
           res[i] = Math.abs(leftsum[i] - rightsum[i] );

        }
        System.out.println(Arrays.toString(res));

    }
}
