/*
 * Program       : RunningSumOfArray.java
 * Problem       : Running Sum of 1D Array (Prefix Sum Construction)
 * Description   : Build a prefix sum array where each element stores the cumulative sum from index 0 to the current index.
 *
 * Sample Input  :
 * nums = [1, 2, 3, 4]
 *
 * Sample Output :
 * Prefix Sum = [1, 3, 6, 10]
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
