/*
 * Program        : RunningSumOf1DArray.java
 * Problem        : Running Sum of 1D Array
 * Description    : Given an integer array nums, return the running sum of the array,
 *                  where each element at index i is equal to the sum of all elements
 *                  from index 0 to i.
 *
 * Sample Input   : nums = [1,2,3,4]
 * Sample Output  : [1,3,6,10]
 */
package PrefixSum.Easy;
import java.util.*;
public class BuildPrefixSumArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       int [] arr = new int[n];
       for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
       }
       int[] prefixsum = new int[n];
       prefixsum[0]=arr[0];
       for(int i=1; i<n; i++){
        prefixsum[i]=prefixsum[i-1] + arr[i];
       }

       for(int i=0; i<n; i++){
        System.out.print(prefixsum[i]+" ");
       }
    }
}
