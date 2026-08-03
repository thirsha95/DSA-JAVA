/*
============================================================
Problem    : Binary to Decimal
File Name  : BinaryToDecimal.java
Category   : Number System
Pattern    : Binary → Decimal
Difficulty : Easy

Description:
Convert a given binary number into its decimal representation.

Approach:
1. Traverse the binary number from right to left.
2. Start power = 0.
3. Multiply each digit by 2^power.
4. Add the result to decimal.
5. Increment power after each digit.

Key Idea:
Positional Value (Base 2)

Time Complexity : O(n)
Space Complexity: O(1)

Sample Input:
101101

Sample Output:
45
------------------------------------------------
Digit    Power    2^Power    Value
------------------------------------------------
1         0        1          1 × 1  = 1
0         1        2          0 × 2  = 0
1         2        4          1 × 4  = 4
1         3        8          1 × 8  = 8
0         4        16         0 ×16  = 0
1         5        32         1 ×32  = 32
------------------------------------------------

Decimal = 32 + 8 + 4 + 1 = 45
============================================================
*/

import java.util.*;

public class BinaryToDecimal {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String binary = sc.nextLine();
    
     int decimal = 0 ;
     int power = 0;
     for(int i=binary.length()-1 ; i>=0; i--){
        int digit = binary.charAt(i)-'0'; // convert charcater(number or digit) into digit  5-'0';
        decimal += digit * (int)Math.pow(2,power);
        power++;
     }
     System.out.print(decimal);
    }
}