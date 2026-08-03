/*
 * Folder:
 * Stack/Medium
 *
 * File Name:
 * MinStack.java
 *
 * Problem:
 * Min Stack
 *
 * Pattern:
 * Stack + Auxiliary Stack
 *
 * Problem Statement:
 * Design a stack that supports push, pop, top,
 * and retrieving the minimum element in O(1) time.
 *
 * Key Idea:
 * - mainStack stores all elements.
 * - minStack stores only minimum elements.
 * - minStack.peek() always gives current minimum.
 *
 * Sample Input:
 * 5
 * 8 3 10 2 6
 *
 * Sample Output:
 * Minimum: 2
 *
 * Time Complexity:
 * Push    : O(1)
 * Pop     : O(1)
 * Get Min : O(1)
 *
 * Space Complexity:
 * O(n)
 */

import java.util.*;
public class MinStack {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    for(int i=0; i<n; i++){
        int x = sc.nextInt();

        stack.push(x);
   
      if(minstack.isEmpty() || x <= minstack.peek()){
        minstack.push(x);
      }   
    }
    System.out.print("Minimum : " + minstack.peek());
    }
}
