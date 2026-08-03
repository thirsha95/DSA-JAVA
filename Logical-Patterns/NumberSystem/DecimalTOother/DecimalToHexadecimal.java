/*
============================================================
Problem    : Decimal to Hexadecimal
File Name  : DecimalToHexadecimal.java
Category   : Number System
Pattern    : Decimal → Hexadecimal
Difficulty : Easy

Description:
Convert a given decimal number into its hexadecimal representation.

Approach:
1. Divide the decimal number by 16.
2. Store the remainder.
3. If remainder is 10–15, convert it to A–F.
4. Update the number using n = n / 16.
5. Repeat until n becomes 0.
6. Read the remainders in reverse order.

Key Idea:
Repeated Division by Base (16)

Time Complexity : O(log₁₆N)
Space Complexity: O(log₁₆N)

Sample Input:
255

Sample Output:
FF
============================================================
*/

import java.util.*;
public class DecimalToHexadecimal {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int decimal = sc.nextInt();
    
     String hex ="";

     while(decimal > 0){
        int rem = decimal % 16;
        if(rem < 10){
         hex = rem + hex;
        }
        else{
        char  ch =  (char)((rem-10) + 'A');
        hex = ch + hex;
        }
        decimal = decimal / 16;
     }
      System.out.print(hex);
    }
}