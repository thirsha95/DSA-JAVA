/*
Program: Lowest Number Formation
Problem: Rearrange the digits of a given number to form the smallest possible number without leading zeros.
Description:
1. Convert the input number into an integer array.
2. Sort all digits in ascending order.
3. If the first digit is 0, swap it with the first non-zero digit.
4. Convert the array back to a number.
5. Print the resulting smallest number.

Sample Input:
543210

Sample Output:
102345
*/

package Arrays.Easy;
import java.util.*;
public class LowestNumberFormation {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();


    int temp = num;
    int length =0;// creating n : length or size for array
    while( temp >0){
    length++;
    temp=temp/10;
  }
   temp = num;
   int[] arr = new int[length];
   //now put nums value as array elements


   for(int i = length - 1; i >= 0; i--){ //%10 always gives the last digit first, so the digits come out in reverse order.
    arr[i] = temp % 10; ///%10 always gives the last digit first, so the digits come out in reverse order.
    temp = temp/10;
   }
  
   Arrays.sort(arr);// sort the array 543210 --> 012345
   if(arr[0] == 0){
    for(int i=1; i<length;i++){
        if(arr[i] !=0){
         int swap=arr[0];
         arr[0] = arr[i];
         arr[i]= swap;
         break;
       }
    }
   }
   // array back to number;
       int res=0;
       for(int digit : arr){
        res = res *10 +digit;
       }
       System.out.print(res);


    }
}
// public class Solution {
//     public static void main(String args[] ) throws Exception {
//     
//         Scanner sc = new Scanner(System.in);
//         String num = sc.next();
//         char[] digits = num.toCharArray();
//         Arrays.sort(digits);
        
//  // If first digit is 0, swap with first non-zero digit
//         if(digits[0]=='0'){
//             for(int i = 1; i<digits.length; i++){
//                 if(digits[i]!= '0'){
//                     char temp = digits[0];
//                     digits[0] = digits[i];
//                     digits[i] = temp;
//                     break; //The break is used because we only need to do one swap.
//                 }
//             }
            
//         }
//         System.out.print(new String(digits));
        
//     }
// }