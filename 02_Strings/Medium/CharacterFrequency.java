/*
Counts frequency of lowercase letters (a–z) in a string.
Ignores uppercase letters, spaces, and special characters.
Uses ASCII mapping: 'a' → index (0–25).
*/
package Strings.Medium;

import java.util.*;
public class CharacterFrequency {
    public static void main (String[]args){
      Scanner sc = new Scanner (System.in);
      String str = sc.nextLine();
      
     int[]freq = new int[26];
     char[] arr = str.toCharArray(); 
     for(char ch  : arr){
        if(ch >= 'a' && ch <='z'){ // ignores 'A',SPACES, special characters.
          freq[ch - 'a']++;   
        }
       
     }

     for(int i = 0; i<26; i++){
        if(freq[i] > 0){
            System.out.println("frequency of " +  (char)(i + 'a') + " "+ freq[i]);
        }
     }
    }
}


// ch - 'a' → converts character to index (letter → number), used for storing frequency
// i + 'a' → converts index back to character (number → letter), used for printing