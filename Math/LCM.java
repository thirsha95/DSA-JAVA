/*
Program: LCM (Least Common Multiple)

Problem:
Find the Least Common Multiple (LCM) of two given integers.

Description:
This program reads two integers from the user, computes their Greatest Common Divisor (GCD) using the Euclidean Algorithm, and then calculates the LCM using the formula:
Formula:
LCM(a, b) × GCD(a, b) = a × b
LCM = (a * b) / GCD(a, b).

*/
package Math;
import java.util.*;
public class LCM {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int ans = LCM(a,b);
     System.out.print("LCM OF " + a  +" " + b +" "+ " is : " +  ans  );

    }
    public static int GCD(int a, int b){
        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a ;
    }
    public static int  LCM(int a, int b){
        return (a * b)/ GCD(a,b);
    }
}
