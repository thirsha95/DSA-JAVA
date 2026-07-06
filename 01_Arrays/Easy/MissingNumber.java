package Arrays.Easy;
/*
Program: Find the Missing Number in an Array

Description:
This program finds the missing number in an array containing numbers from 1 to n
by using linear traversal or the sum formula approach.
*/

//But if numbers are from 1 to n and one number is missing, the array should have n-1 elements, not n.
import java.util.*;
public class MissingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n-1];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int result = missing(arr,n);
        System.out.println("output "+ result);
        
    } 
    public static int missing(int[]arr, int n){
    // TOTAL array sum
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        // TOTAL N sum
      int total = n*(n+1)/2;
      int missingnumber =  total - sum ;
      // total is always larger than array sum; 
      // subtracting in reverse (sum - total) would give a negative number
      return missingnumber;
    } 
}
