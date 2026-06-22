/*
Program: Single Number III

Problem:
Find the two numbers that appear only once in the array.

Example:
Input : [1, 2, 1, 3, 2, 5]
Output: [3, 5]

Description:
1. XOR all numbers.
2. Find a bit where the two unique numbers differ.
3. Split numbers into two groups using that bit.
4. XOR each group to get the two unique numbers.

Time Complexity: O(N)
Space Complexity: O(1)
*/
package Arrays.Medium;

import java.util.Scanner;

public class singleNumberIII {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] =  sc.nextInt();
      }
      int xor =0;
      for(int num : arr){
         xor ^= num;
      }
      int diffbit = (xor) & (-xor); //finds righmost diffset bit value(1,2,4,8)in 6
      int a =0;  //group a;
      int b=0;  // group b
      for(int num : arr){
        if((num & diffbit )==0){
            a ^= num ;
        }else{
            b ^= num;
        }
      }
     System.out.printf("%d %d",a,b);
    }
}
