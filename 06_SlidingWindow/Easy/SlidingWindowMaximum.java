/*
 * Problem:
 * Sliding Window Maximum
 *
 * Pattern:
 * Sliding Window (Fixed Size) + Monotonic Deque
 *
 * Key Idea:
 * - Find the maximum element in every window of size K.
 * - Store INDICES (not values) in a Deque.
 * - Maintain the deque in decreasing order of values.
 * - The front always contains the index of the maximum element.
 *
 * Why Store Indices?
 * - To know when an element goes out of the current window.
 *
 * Time Complexity:
 * O(N)
 *
 * Space Complexity:
 * O(K)
 *
 * Sample Input:
 * 8
 * 1 3 -1 -3 5 3 6 7
 * 3
 *
 * Sample Output:
 * [3, 3, 5, 5, 6, 7]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        LinkedList<Integer> deque = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (j < n) {
            // Remove all smaller elements from the back
            while (!deque.isEmpty() && arr[j] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(j);  // Add current index

            if (j - i + 1 < k) {// Window not complete
                j++;
            }
            else if (j - i + 1 == k) {// Window complete

                answer.add(arr[deque.peekFirst()]);  // Front of deque is the maximum
                if (deque.peekFirst() == i) {  // Remove the maximum if it is leaving the window
                    deque.removeFirst();
                }

                i++;
                j++;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}