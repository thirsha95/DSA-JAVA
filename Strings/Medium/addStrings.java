/*
Program     : Add Strings
Problem     : LeetCode 415
Description : Add two numbers represented as strings without using BigInteger.
*/
package Strings.Medium;
import java.util.*;
public class addStrings {
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      String num1 = sc.nextLine();
      String num2 = sc.nextLine();

      int i = num1.length()-1;
      int j = num2.length()-1;
      int carry =0;
      StringBuilder res = new StringBuilder();
      while(i >= 0 || j >=0 ||carry > 0){ //works if any one is false also
       int sum = carry;
       if(i >= 0){
        sum += num1.charAt(i)-'0';
        i--;
       }
       if(j >= 0){
        sum += num2.charAt(j)-'0';
        j--;
       }

       int digits = sum % 10;
           carry = sum / 10;
           res.append(digits);
      }
       System.out.println(res.reverse().toString());
    }
}
