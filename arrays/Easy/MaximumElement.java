package arrays.Easy;
/*
Program: Find Maximum Element in an Array

Description:
This program finds the largest element in an array by traversing all elements.
It compares each value and keeps track of the maximum found.

Time Complexity: O(n)
Space Complexity: O(1)

*/
import java.util.*;
public class MaximumElement {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]arr = new int[n];
     for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
     }
     int result = maxelement(arr);
     System.out.println("output " +result);

    }
    public static int maxelement(int[]arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
     return max;
    }
}
