
/*
 mathematical genius
 * Program    : Rahul, a mathematical genius will be given a positive number N and he needs to reduce it to 0 (zero).
 * Problem    : Take one of the divisors of N, which is different from N itself, and subtract it from N.
 * Description: Perform the operation repeatedly until N becomes 0.
 * Objective  : Find the minimum number of steps required to reduce N to 0.
 * 
 */

package Math;

import java.util.*;
public class ReduceToZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps =0;
        while(n>0){
            int div = 1;
            for(int i=1 ; i<n; i++ ){
              if(n % i == 0){
                div =i;
              }
        }
            n =  n - div;
              steps++;
       }
         System.out.print("steps : " + steps);
        
    }
}

// NOTE:
// This greedy approach always subtracts the largest proper divisor of N.
// However, it does NOT always produce the minimum number of steps.
//
// If the problem asks for the minimum number of steps,
// a Dynamic Programming (DP) or Breadth-First Search (BFS)
// approach should be used instead of this greedy method.