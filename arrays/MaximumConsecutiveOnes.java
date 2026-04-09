/*
Program: Find Maximum Consecutive Ones in a Binary Array
Example: [1, 1, 0, 1, 1, 1] → 3

Description:
This program counts the longest sequence of consecutive 1s in a binary array
by traversing the array and tracking current and maximum streaks.
*/


import java.util.*;
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int [n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int result = Max(arr);
        System.out.println("output " + result);
        
    }
    public static int Max(int[] arr){
        int maxcount = 0;
        int currentcount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== 1){
            currentcount++;
            } else {
                currentcount=0 ;
            }
                // reset streak on 0
            if(currentcount > maxcount){
                maxcount = currentcount;
            }
        }
        return maxcount;
    }

    }

