/*
 * Problem:
 * Find the first negative number in every window of size K.
 * HERE WE NEED TO ACESS THE ACTUAL ELEMENTS OR STORE THE ACTUAL ELMENTS SO WE USE THIS ALGORITHM; 
 *
 * Pattern:
 * Sliding Window (Fixed Size) + Queue
 *
 * Approach:
 * - Use two pointers (i and j) to maintain a window of size K.
 * - Store only negative numbers of the current window in a Queue.
 * - When the window size becomes K:
 *      - If queue is empty, there is no negative number in the window.
 *      - Otherwise, queue.peek() gives the first negative number.
 * - Before sliding the window, remove the outgoing negative element
 *   (arr[i]) from the queue if it exists.
 *
 * Algorithm:
 * 1. Initialize i = 0 and j = 0.
 * 2. Traverse the array using j.
 * 3. If arr[j] is negative, add it to the queue.
 * 4. If window size (j - i + 1) < K, increase j.
 * 5. If window size == K:
 *      - Add first negative number using queue.peek().
 *      - Remove arr[i] from queue if arr[i] is negative.
 *      - Move window: i++ and j++.
 *
 * Sample Input:
 * arr = [12, -1, -7, 8, -15, 30, 16]
 * k = 3
 *
 * Sample Output:
 * [-1, -1, -7, -15, -15]
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(k)
 */
//HERE WE NEED TO ACESS THE ACTUAL ELEMENTS OR STORE THE ACTUAL ELMENTS SO WE USE THIS ALGORITHM; 
//IN PREVOUS ALGORITHM WE JUST NEED TO CALCULATE SOMETHING;

import java.util.*;
public class FirstNegativeNumber {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    int k =sc.nextInt();
    
    Queue<Integer> queue = new LinkedList<>();
    ArrayList<Integer> ans = new ArrayList<>();
    int i = 0;
    int j = 0;

   while(j < n) {

    // Step 1: Add negative numbers from current window
    if(arr[j] < 0) {
        queue.add(arr[j]);
    }


    // Step 2: Window size is not reached yet
    if(j - i + 1 < k) {
        j++;
    }
    // Step 3: Window size reached
    else if(j - i + 1 == k) {

        // Find first negative number in current window
        if(queue.isEmpty()) {
            ans.add(0);
        }
        else {
            ans.add(queue.peek());
        }

        // Remove outgoing element (arr[i])
        if(arr[i] < 0) {
            queue.remove();
        }
        // Slide the window
        i++;
        j++;
    }

}
       System.out.print(ans);
    }
}