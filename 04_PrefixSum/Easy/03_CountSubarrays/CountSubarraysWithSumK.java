/*
===========================================================
 COUNT SUBARRAYS WITH SUM K
===========================================================

Question:
Given an integer array and an integer K,
count the number of subarrays whose sum is exactly K.

Pattern:
Prefix Sum + HashMap (Frequency)

Key Idea:
If currentPrefixSum - K has appeared before,
those previous prefix sums form valid subarrays.

Formula:
currentPrefixSum - previousPrefixSum = K

Therefore:
previousPrefixSum = currentPrefixSum - K

HashMap:
prefixSum → frequency

prefixsum - k = what am I searching for?
prefixsum = what am I storing now?

===========================================================
Example:
arr = [1, 2, 3]
K = 3

Subarrays:
[1, 2] → 3
[3]    → 3

Answer = 2
===========================================================
*/
import java.util.*;
public class CountSubarraysWithSumK {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    int k = sc.nextInt();
    
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    
    int count = 0;
    int prefixsum = 0;
    for(int i=0; i<n; i++){
        prefixsum +=arr[i];
    
    if(map.containsKey(prefixsum-k)){
     count += map.get(prefixsum-k);
    }

    map.put(prefixsum , map.getOrDefault(prefixsum,0)+1 );
    }
    System.out.print(count);

    }
}
