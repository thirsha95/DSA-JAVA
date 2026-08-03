/*
============================================================
Problem    : Hexadecimal to Decimal
File Name  : HexadecimalToDecimal.java
Category   : Number System
Pattern    : Hexadecimal → Decimal
Difficulty : Easy

Description:
Convert a given hexadecimal number into its decimal representation.

Approach:
1. Traverse the hexadecimal number from right to left.
2. Start power = 0.
3. Convert each hexadecimal digit into its decimal value.
4. Multiply the value by 16^power.
5. Add the result to decimal.
6. Increment power after each digit.

Key Idea:
Positional Value (Base 16)

Time Complexity : O(n)
Space Complexity: O(1)

Sample Input:
1A

Sample Output:
26
============================================================
*/

import java.util.*;
public class HexadecimalToDecimal {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);    
    String hex = sc.nextLine();

    int decimal = 0;
    int power = 0;
    for(int i=hex.length()-1; i>=0; i--){
      int ch = hex.charAt(i);

      if(ch >='0' && ch <='9'){
        decimal += (ch-'0') * (int) Math.pow(16,power); //math.pow return type default double so we cast it to int
      }else{
        decimal += (ch-'A' + 10)* (int)(Math.pow(16,power));
      }
      
      power++;
    }
   System.out.print(decimal);
   }
}