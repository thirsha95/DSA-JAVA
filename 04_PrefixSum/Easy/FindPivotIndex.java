/*
 * Program       : FindPivotIndex.java
 * Problem       : LeetCode 724 - Find Pivot Index
 * Description   : Find the index where the sum of all elements to the left
 *                 equals the sum of all elements to the right.
 *                 Uses the Prefix Sum / Running Sum technique in O(n) time
 *                 and O(1) extra space.
 *
 * Sample Input  :
 * nums = [1, 7, 3, 6, 5, 6]
 *
 * Sample Output :
 * 3
 */
package PrefixSum.Easy;
import java.util.*;
public class FindPivotIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        } 

        int totalsum =0;
        for(int num : arr){
            totalsum += num;
        }
        int leftsum =0;
        for(int i=0; i<arr.length; i++){//index
         int rightsum = totalsum - leftsum - arr[i]; //visualize the algorithm from strat arr[0];
         if(leftsum == rightsum){
            System.out.print(i);
             return;
         }
         leftsum += arr[i];
        
        }
        System.out.print("-1");
    }
}

//BRUTE FORCE APPROACH;
        // for(int i=0; i<nums.length; i++){//index
        // int leftsum =0;
        // for(int j=0; j<i; j++){
        //     leftsum += nums[j];
        // }
        // int rightsum =0;
        // for(int k =i+1;k<n; k++){
        //     rightsum += nums[k];
        // }
        //   if(leftsum == rightsum){
        //     return i;
        // }
        //   return -1;  