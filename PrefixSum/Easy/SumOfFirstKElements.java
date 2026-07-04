/*
 * Program       : SumOfFirstKElements.java
 * Problem       : Sum of First K Elements Using Prefix Sum
 * Description   : Build a prefix sum array and use it to find the sum of the first K elements in O(1) time.
 *
 * Sample Input  :
 * nums = [2, 4, 1, 6, 3]
 * K = 3
 *
 * Sample Output :
 * 7
 */
package PrefixSum.Easy;
import java.util.*;
public class SumOfFirstKElements {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }

       int prefixsum = 0;
       for(int i=0; i<k; i++){
        prefixsum +=arr[i];
       }
       System.out.print(" FIRST K SUM IS : "+ prefixsum);

    }
}
