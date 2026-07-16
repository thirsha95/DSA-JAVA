/*
 * LeetCode Pattern: Celebrity Problem
 *
 * Problem:
 * You are given an N × N matrix `matrix`.
 *
 * matrix[i][j] = 1  -> Person i knows person j
 * matrix[i][j] = 0  -> Person i does not know person j
 * matrix[i][i] = 0  -> A person does not know themselves
 *
 * A celebrity is someone who:
 * 1. Knows nobody.
 * 2. Everybody else knows them.
 *
 * Return the index of the celebrity.
 * If no celebrity exists, return -1.
 *
 * ------------------------------------------------------------
 * Example 1:
 *
 * Input:
 * matrix = {
 *   {0,1,1},
 *   {0,0,0},
 *   {0,1,0}
 * }
 *
 * Output:
 * 1
 *
 * Explanation:
 * - Person 1 knows nobody.
 * - Person 0 knows Person 1.
 * - Person 2 knows Person 1.
 * Therefore, Person 1 is the celebrity.
 *
 * ------------------------------------------------------------
 * Example 2:
 *
 * Input:
 * matrix = {
 *   {0,1,0},
 *   {0,0,1},
 *   {1,0,0}
 * }
 *
 * Output:
 * 
 *NO celebrity
 * Explanation:
 * No person satisfies both celebrity conditions.
 *
 * ------------------------------------------------------------
 * Observation:
 *
 * Suppose there are two people: A and B.
 *
 * If A knows B,
 *      -> A cannot be the celebrity.
 *
 * If A does NOT know B,
 *      -> B cannot be the celebrity.
 *
 * Therefore, every comparison eliminates exactly one person.
 * After N-1 comparisons, only one possible celebrity remains.
 * This person is called the candidate.
 *
 * ------------------------------------------------------------
 * Pattern:
 * Candidate Elimination (Two Pointers / Single Candidate)
 *
 * ------------------------------------------------------------
 * Approach:
 *
 * Step 1:
 * Find one possible celebrity using candidate elimination.
 *
 * Step 2:
 * Verify the candidate by checking:
 *   - Candidate knows nobody.
 *   - Everybody else knows the candidate.
 *
 * Step 3:
 * If both conditions are true, return the candidate.
 * Otherwise, return -1.
 *
 * ------------------------------------------------------------
 * Time Complexity : O(N)
 * Space Complexity: O(1)
 */

import java.util.*;
public class CelebrityProblem {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] matrix = new int[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n ;j++){
            matrix[i][j]=sc.nextInt();
        }
      }
       int candidate =0;
      for(int i=1; i<n; i++){
          if(matrix[candidate][i]==1){
            candidate = i;
          }
      }


      for(int i=0; i<n; i++){
        if(i==candidate){
             continue;
        }
          //If A knows B → A is out  ||If A does not know B → B is out;
          if(matrix[candidate][i]==1 || matrix[i][candidate]==0){
          System.out.print("NO celebrity");
          return;
        }
           
        }
      System.out.print(candidate);
      
    }
}

