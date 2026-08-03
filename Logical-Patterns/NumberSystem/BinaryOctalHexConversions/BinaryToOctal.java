/*
Binary → Decimal → Octal
Binary → Decimal → Hexadecimal

Octal → Decimal → Binary
Octal → Decimal → Hexadecimal

Hexadecimal → Decimal → Binary
Hexadecimal → Decimal → Octal
 */
/*
============================================================
Problem    : Binary to Octal
File Name  : BinaryToOctal.java
Category   : Number System
Pattern    : Binary → Octal
Difficulty : Easy

Description:
Convert a binary number into its octal representation.

Approach:
Method 1 (Using Decimal Bridge):
1. Convert Binary to Decimal using positional value.
2. Convert Decimal to Octal using repeated division by 8.
3. Print the octal result.

Key Idea:
Any Base → Decimal → Any Base

Formula:
Binary → Decimal:
Digit × 2^Position

Decimal → Octal:
Repeated Division by 8

Alternative Approach (Shortcut):
Binary → Octal can be done directly by grouping
3 binary bits from right to left.

Reason:
8 = 2³

Example:
Binary:
101101

Grouping:
101 101

Conversion:
101 = 5
101 = 5

Octal:
55

Time Complexity : O(n)
Space Complexity: O(1)

Sample Input:
101101

Sample Output:
55
============================================================
*/

import java.util.*;
public class BinaryToOctal {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String binary = sc.nextLine();

    int decimal = 0;
    int power = 0;
    for(int i=binary.length()-1; i>=0; i--){
        int digit = binary.charAt(i)-'0';
        decimal += digit * Math.pow(2,power);
        power++;
    }
    String octal ="";
    while(decimal > 0){
        int rem = decimal %  8 ;
        octal =   rem + octal;
        decimal = decimal / 8; 
    }
    System.out.print(octal);
    }
}
