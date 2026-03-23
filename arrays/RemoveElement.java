// Problem: Remove Element
// Topic: Array
// Pattern: Two Pointers (Filter / Overwrite)

// Idea:
// Use two pointers:
// i -> read pointer (traverses array)
// k -> write pointer (stores valid elements)
// Copy elements not equal to val to front
package arrays;

public class RemoveElement {
    
    public static void main (String[] args){
    int[] nums = {3,2,2,3};
    int val = 3;
    RemoveElement obj = new RemoveElement();
    int res = obj.removenum(nums,val);
    System.out.print("nums : ") ;
    for(int i=0; i<res; i++){
    System.out.print(nums[i] + " ");
    }
    System.out.println(" ");
    System.out.println("count : "+res);

    }

    public  int removenum(int nums[],int val ){
        int p = 0 ;
        for(int i=0; i<nums.length; i++){
           if(nums[i] != val){
            nums[p] = nums[i];
            p++;
           }
        }
        return p;
    }
}
