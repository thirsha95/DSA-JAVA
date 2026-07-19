/*
Program: Remove Element
Problem:
Remove all occurrences of a given value from an array and
return a new array containing only the remaining elements.

Sample Input:
nums = {3, 2, 2, 3}
val = 3

Sample Output:
Remaining Elements: 2 2
*/

package Arrays.Easy;

public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int[] res = removenum(nums, val);

        System.out.print("Remaining Elements: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    // i -> Read pointer
    // p -> Write pointer
    public static int[] removenum(int[] nums, int val) {

        int p = 0;

        // Copy valid elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p] = nums[i];
                p++;
            }
        }

        // Create result array of exact size
        int[] ans = new int[p];

        // Copy valid elements
        for (int i = 0; i < p; i++) { //no need the one more raray can use return nums[i];
            ans[i] = nums[i];
        }

        return ans;
    }
}