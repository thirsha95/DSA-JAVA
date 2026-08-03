/*
============================================================
Problem    : Decimal to Octal
File Name  : DecimalToOctal.java
Category   : Number System
Pattern    : Decimal → Octal
Difficulty : Easy

Description:
Convert a given decimal number into its octal representation.

Approach:
1. Divide the decimal number by 8.
2. Store the remainder.
3. Update the number using n = n / 8.
4. Repeat until n becomes 0.
5. Read the remainders in reverse order.

Key Idea:
Repeated Division by Base (8)

Time Complexity : O(log₈N)
Space Complexity: O(log₈N)   // Using String or Stack

Sample Input:
83

Sample Output:
123

============================================================
*/


import java.util.*;
public class DecimalToOctal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String octal = " ";

        while(decimal >0){
            int rem = decimal % 8;
            octal = rem + octal;
            decimal = decimal / 8;
        }
        System.out.print(octal);
    }
}
