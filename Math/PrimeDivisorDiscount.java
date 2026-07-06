/*
Program: Prime Divisor Count Discount

Problem Description:
Rohan selects two jewellery items located at indices i and j.
Consider all numbers between i and j (inclusive).

For each number:
1. Find its total number of divisors.
2. Check whether the divisor count is a prime number.
3. If it is prime, include that number in the discount count.

Print the total count of numbers whose number of divisors is prime.

Example:
Input:
10
15

Output:
2

Explanation:
Example:

i = 10, j = 15

10 -> 4 divisors  -> Not Prime
11 -> 2 divisors  -> Prime ✓
12 -> 6 divisors  -> Not Prime
13 -> 2 divisors  -> Prime ✓
14 -> 4 divisors  -> Not Prime
15 -> 4 divisors  -> Not Prime
Count = 2

11 has 2 divisors (prime count)
13 has 2 divisors (prime count)

Total numbers satisfying the condition = 2
*/

package Math;

import java.util.*;
public class PrimeDivisorDiscount {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); // 10
     int m = sc.nextInt();//15
     //logic
     int primecount = 0;
     for(int i=n ; i<=m ; i++){  // n =10 && m = 15 find the diviors between 10 and 15
        int factorcount = 0;   //factor count
      for(int j=1; j<=i; j++){ // how many does a 10each (i) has 
          if(i % j==0){
            factorcount++;
          }
      }

      int count =0; // now this factorcount is prime or not we can write seperate prime function also to check
       //we are checking the factors for factorcount is it PRIME?  
      for(int k=1 ; k<=factorcount;  k++){ // factors check will be from 1 : UNTIL FACTORCOUNT
          if(factorcount % k==0){
            count++;
          }
       }
       if(count == 2){ // PRIME NUMBER CONTAINS 2 FCATORS SO WECAN INCREASE THE TOTAL
        primecount++;
       }
   }
     System.out.println("primecount " +primecount);
    }
}
