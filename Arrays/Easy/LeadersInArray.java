package Arrays.Easy;
import java.util.*;
public class LeadersInArray{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      int[] leaders = new int[n];
      int count=0; // here count is to fill the leaders array;
      int maxright = Integer.MIN_VALUE;
       for(int i=n-1; i>=0; i--){
         if(arr[i]> maxright){
            maxright = arr[i];
            leaders[count++]= arr[i];
         }
       }
       for(int i= count-1 ; i>=0 ; i--){
       System.out.print(leaders[i] +" ");
    }
    }
}