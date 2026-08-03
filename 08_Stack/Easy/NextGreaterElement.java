/*
 * Folder:
 * Stack/Medium
 *
 * File Name:
 * NextGreaterElement.java
 *
 * Problem:
 * Next Greater Element
 *
 * Pattern:
 * Monotonic Stack (Decreasing Stack)
 *
 * Problem Statement:
 * Given an array, find the next greater element
 * for every element.
 *
 * The next greater element is the first greater
 * element present on the right side.
 *
 * If no greater element exists, return -1.
 *
 *
 * Sample Input:
 * 5
 * 4 5 2 10 8
 *
 * Sample Output:
 * 5 10 10 -1 -1
 *
 *
 * Algorithm:
 *
 * 1. Create an empty stack.
 *
 * 2. Traverse the array from right to left.
 *
 * 3. Remove elements from the stack that are
 *    smaller than or equal to the current element.
 *
 *    Reason:
 *    Smaller elements can never become the answer
 *    because the current element is already bigger.
 *
 * 4. If stack is empty:
 *       No greater element exists.
 *       Store -1.
 *
 *    Else:
 *       Stack top is the next greater element.
 *
 * 5. Push the current element into the stack.
 *
 *    Reason:
 *    Current element can become the answer for
 *    elements present on the left side.
 *
 *
 * Dry Run:
 *
 * Input:
 * [4, 5, 2, 10, 8]
 *
 * Start from right:
 *
 * 8:
 * Answer = -1
 * Stack: 8
 *
 * 10:
 * Remove 8 because 8 < 10
 * Answer = -1
 * Stack: 10
 *
 * 2:
 * 10 is greater
 * Answer = 10
 * Stack: 10 2
 *
 * 5:
 * Remove 2 because 2 < 5
 * 10 is greater
 * Answer = 10
 * Stack: 10 5
 *
 * 4:
 * 5 is greater
 * Answer = 5
 *
 * Output:
 * 5 10 10 -1 -1
 *
 *
 * Key Idea:
 *
 * Store only useful elements.
 *
 * Smaller elements become useless when a bigger
 * element arrives, so remove them.
 *
 * POP → Find Answer → PUSH Current Element
 *
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 *  /*
 * 
 * 
 * For every element:
 * 1. Remove useless elements (POP)
 *    - Remove smaller elements because they can never
 *      become the next greater element.
 *
 * 2. Find answer
 *    - Stack top is the next greater element.
 *    - If stack is empty, answer is -1.
 *
 * 3. Push current element
 *    - Current element can become the answer
 *      for elements on the left.
         
 * 
 */
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    int[] res = new int[n];

    Stack<Integer> stack = new Stack<>();
    for(int i=arr.length-1; i>=0 ; i--){
        while(!stack.isEmpty() && stack.peek() <= arr[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            res[i]=-1;
        }else{
            res[i]=stack.peek();
        }
        stack.push(arr[i]);
    }
    for(int i=0; i<n; i++){
        System.out.print(res[i] +" ");
    }
    }
}
/*
 * Dry Run:
 *
 * Array: [4,5,2,10,8]
 *
 * 8  -> -1, push 8
 * 10 -> remove 8, -1, push 10
 * 2  -> 10 is greater, push 2
 * 5  -> remove 2, 10 is greater, push 5
 * 4  -> 5 is greater, push 4
 *
 * Answer:
 * [5,10,10,-1,-1]
 */