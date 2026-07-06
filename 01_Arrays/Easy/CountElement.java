package Arrays.Easy;
/*
Program: Find and Count Occurrences of an Element in an Array

Description:
This program reads an array of integers and counts how many times
a given target element appears in the array using linear search.

 */
import java.util.*;
public class CountElement {
    public static void main (String[] args){
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     // form array
     int[] arr = new int[n];
    //scan values to make arr
    for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
    }
    //scann otherr inputs which is needed
    int target = sc.nextInt();
    //call method
    int result = findcount(arr,target);
    System.out.println("output "+ result); 


    } 
    public static int findcount(int arr[], int target){
       int count=0;
       for(int i=0; i<arr.length; i++){
         if(arr[i]==target) 
          count++;
       }
       return count;
    }
}
