/*
Problem:
Maximum Number of Vowels in a Substring of Length K

Sample Input:
s = "abciiidef"
k = 3

Sample Output:
3


Pattern:
Sliding Window - Fixed Size Window

Approach:
1. Create the first window of size k.
2. Count the vowels present in the first window and store only the information
   needed (vowelCount), not the actual window.
3. Slide the window:
   - Add the new character entering the window and update vowelCount if it is a vowel.
   - Remove the old character leaving the window and update vowelCount if it is a vowel.
4. Track the maximum vowelCount among all windows.

Key Idea:
The window is not stored. We only maintain the required information about the
current window and update it by adding and removing elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
public class MaximumVowelsSubstring {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int k = sc.nextInt();
   
    int vowel = 0;
    for(int i=0; i<k; i++){
     if(isvowel(str.charAt(i))){
      vowel++;
     }
   }
     int maxvowel = vowel ;
     for(int j=k; j<str.length(); j++){
      
      if(isvowel(str.charAt(j))){
         vowel++;
      }
      if(isvowel(str.charAt(j-k))){
         vowel--;
      }
      
     maxvowel = Math.max(maxvowel,vowel);
     }
     System.out.print(maxvowel);
     }
    
    
    public static boolean isvowel(char ch){
      return ch=='a' ||
             ch=='e' ||
             ch=='i' ||
             ch=='o' ||
             ch=='u' ;
    }

}

/*    if inside main method implementation do i wrote seperate method
   if(str.charAt(j) == 'a' ||
           str.charAt(j) == 'e' ||
           str.charAt(j) == 'i' ||
           str.charAt(j) == 'o' ||
           str.charAt(j) == 'u') {

            vowel++;
        }


        // Remove old character leaving the window
        if(str.charAt(j-k) == 'a' ||
           str.charAt(j-k) == 'e' ||
           str.charAt(j-k) == 'i' ||
           str.charAt(j-k) == 'o' ||
           str.charAt(j-k) == 'u') {

            vowel--;
        }
            */