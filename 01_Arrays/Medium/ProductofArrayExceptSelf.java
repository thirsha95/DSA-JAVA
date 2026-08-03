/*
Program: ProductofArrayExceptSelf.java

Problem:
Given an integer array nums, return an array answer such that
answer[i] is equal to the product of all the elements of nums
except nums[i], without using division.

Description:
1. Compute the prefix product for every index.
2. Compute the suffix product for every index.
3. For each position:
   - First element = suffix product of index 1.
   - Last element = prefix product of index n-2.
   - Middle elements = prefix(i-1) × suffix(i+1).
4. Return the resulting product array.

Sample Input:
nums = [-1, 1, 0, -3, 3]

Sample Output:
[0, 0, 9, 0, 0]
*/

package Arrays.Medium;
class ProductofArrayExceptSelf{
   public static void main(String[] args) {
   int[] nums = {-1,1,0,-3,3};
   int[] res = productexceptself(nums);
   for(int val : res){
    System.out.println(val);
   }

       
   }
   public static int[] productexceptself(int[] nums){
    int n = nums.length;
    int[] leftproduct = new int [n];
    int[] rightproduct = new int[n];
    int[] res = new int[n];
    //prefix product
    int product=1;
    for(int i=0 ; i <nums.length; i++){
      product *=  nums[i];
      leftproduct[i] = product;
    }
    //suffix product
    product = 1;
    for(int i=n-1; i>0; i--){
        product*=nums[i];
        rightproduct[i]=product;
    }
     res[0] = rightproduct[1]; //first last
    res[n-1]= leftproduct[n-2];//last
    
    for(int i=1; i<n-1; i++){
        res[i]=leftproduct[i-1]*rightproduct[i+1];
    }
     return res;
   }
   
}
