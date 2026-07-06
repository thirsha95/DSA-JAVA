/*
Program     : Add Binary
Problem     : LeetCode 67
Description : Add two binary strings using digit-by-digit addition with carry in base 2 system. Simulates manual binary addition from right to left.
*/
package Strings.Medium;
import java.util.*;
public class addBinary {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String  num2 = sc.nextLine();
        
        StringBuilder res = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry =0;

       while(i >= 0 || j >= 0 || carry > 0){
        int sum = carry;
        if(i >= 0){
            sum += num1.charAt(i)-'0';
            i--;
        }
        if(j >= 0){
            sum += num2.charAt(j)-'0';
            j--;
        }
        int digit = sum % 2; //BASE 2 NOT 10
        carry = sum / 2 ;
        res.append(digit);
       }
       System.out.println(res.reverse().toString());
    }
    
}
