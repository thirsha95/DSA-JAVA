/*
Program: ConsecutivePrimeSum.java
Problem: Count prime numbers that can be formed by consecutive prime sums starting from 2.
Description: Generate cumulative sums of consecutive primes and count sums that are prime and <= N.
Input: 20

Consecutive Prime Sums:
2 + 3 = 5      (Prime)
2 + 3 + 5 = 10 (Not Prime)
2 + 3 + 5 + 7 = 17 (Prime)

Output: 2
*/
package Math;
import java.util.*;
class ConsecutivePrimeSum{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n= sc.nextInt();
   int sum = 2;
   int count = 0;

   for(int i=3; i<n; i++){
      if(isprime(i)){
       sum += i;
      if(sum <= n && isprime(sum)){
        count++;
       }
     }

   }
  System.out.print(count);

 }
 public static boolean isprime (int n){
       if(n < 1){
        return false;
       }
       for(int i=2; i<n; i++){
        if(n%i==0){
            return false;
          }
        }
         return true;
       }

  }

