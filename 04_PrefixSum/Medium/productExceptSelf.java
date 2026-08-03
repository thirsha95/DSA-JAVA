/*
 * LeetCode 238: Product of Array Except Self
 *
 * Pattern: Prefix Product
 *
 * Intuition:
 * - Store the product of all elements to the left of each index.
 * - Traverse from right to left while maintaining a suffix product.
 * - Multiply the left product with the suffix product to get the answer.
 * - No division is used.
 *
 * Algorithm:
 * 1. Create an answer array initialized with 1.
 * 2. First pass:
 *      - Store prefix product in answer[i].
 *      - Update prefix *= nums[i].
 * 3. Second pass:
 *      - Multiply answer[i] by suffix product.
 *      - Update suffix *= nums[i].
 * 4. Return the answer array.
 *
 * Input:
 * nums = [1,2,3,4]
 *
 * Output:
 * [24,12,8,6]
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1) (excluding output array)
 */

import java.util.*;
public class productExceptSelf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int[] res = new int[n];
        int[] leftproduct = new int[n];
        int[] rightproduct = new int[n];
        

       int product = 1;
        for(int i=0; i<n; i++){
            product *= nums[i];
            leftproduct[i] = product;
        }

        product = 1;
        for(int i=n-1; i>0; i-- ){
            product *= nums[i];
            rightproduct[i] = product;
        }

        res[0]=rightproduct[1];
        res[n-1]= leftproduct[2];

        for(int i=1; i<n-1; i++){
            res[i] = leftproduct[i-1]*rightproduct[i+1];
        }
        System.out.print(res);

    }
}
