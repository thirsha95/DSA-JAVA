/*
============================================================
Problem    : Octal to Decimal
File Name  : OctalToDecimal.java
Category   : Number System
Pattern    : Octal → Decimal
Difficulty : Easy

Description:
Convert a given octal number into its decimal representation.

Approach:
1. Traverse the octal number from right to left.
2. Start power = 0.
3. Multiply each digit by 8^power.
4. Add the result to decimal.
5. Increment power after each digit.

Key Idea:
Positional Value (Base 8)

Time Complexity : O(n)
Space Complexity: O(1)

Sample Input:
123

Sample Output:
83
============================================================
*/

import java.util.*;
public class OctalToDecimal {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String octal = sc.nextLine();

    int decimal = 0;
    int power = 0;
    for(int i=octal.length()-1; i>=0; i--){
        int digit = octal.charAt(i)-'0';
        decimal += digit * (int)Math.pow(8,power); //math.pow return type default double so we cast it to int
        power++;
    }
    System.out.print(decimal);
    }
}
