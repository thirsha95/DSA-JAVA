/*
 * Problem:
 * Daily Temperatures
 *
 * Pattern:
 * Monotonic Decreasing Stack
 *
 * Problem Statement:
 * Given an array of temperatures, find how many days
 * you have to wait until a warmer temperature.
 * If there is no warmer day, return 0.
 *
 * Key Idea:
 * - Similar to Next Greater Element.
 * - Store indexes in stack, not values.
 * - When current temperature is greater than the
 *   temperature at stack top index, we found the answer.
 * - Store the distance between indexes.
 *
 * Why Store Index?
 * - We need the number of days waited.
 * - Formula:
 *   current index - previous index
 *
 * Sample Input:
 * 8
 * 73 74 75 71 69 72 76 73
 *
 * Sample Output:
 * 1 1 4 2 1 1 0 0
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */

import java.util.*;
public class DailyTemperatures {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                int index = stack.pop();
                res[index]=i-index;
            }
            stack.push(i);
        }
         for(int i=0; i<n; i++){
        System.out.print(res[i]+" ");
         }
    }
}
