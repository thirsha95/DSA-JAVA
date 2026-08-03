/*
============================================================
Problem    : Decimal to Binary
File Name  : DecimalToBinary.java
Category   : Number System
Pattern    : Decimal → Binary
Difficulty : Easy

Description:
Convert a given decimal number into its binary representation.

Approach:
1. Divide the decimal number by 2.
2. Store the remainder.
3. Update the number using n = n / 2.
4. Repeat until n becomes 0.
5. Read the remainders in reverse order.

Key Idea:
Repeated Division by Base (2)

Time Complexity : O(log₂N)
Space Complexity: O(log₂N)   // Using String or Stack

Sample Input:
25

Sample Output:
11001
============================================================
*/


import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int decimal = sc.nextInt();

      String binary = " ";

      while(decimal >0){
      int rem = decimal % 2 ;
      binary = rem + binary;
      decimal = decimal / 2;

      }
      System.out.print(binary);
    }

 }

/*// Decimal → Binary
rem = decimal % 2;
decimal = decimal / 2;

to

// Decimal → Octal
rem = decimal % 8;
decimal = decimal / 8;
 */