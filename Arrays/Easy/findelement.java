package arrays.Easy;
/*Program: Find an Element in an Array

Description:
This program reads an array of integers and searches for a given
target element using linear search. It returns the index of the
element if found, otherwise returns -1.
 */
import java.util.*;
public class findelement{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
         for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
         } 
         int target = sc.nextInt();
         //call method
         int result = find(arr,target);
         System.out.println("output " + result);

    } 
    public static int find(int[]arr,int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    } 
}