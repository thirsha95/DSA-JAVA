/*
Counts frequency of uppercase (A–Z) and lowercase (a–z) letters using two arrays.
Ignores  spaces, and special characters.
Uses ASCII mapping: 'A'/'a' → index (0–25).
*/
package Strings.Medium;
import java.util.*;
public class CharacterFrequencyUpperLower {
public static void main (String[] args ){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int[] upperfreq = new int[26];
    int[] lowerfreq = new int[26];

    for(char ch : str.toCharArray()){
        if(ch >= 'A' && ch <= 'Z'){
           upperfreq[ch -'A']++ ;
        }
        else if (ch >= 'a' && ch <= 'z') {
            lowerfreq[ch - 'a']++;
        }

    }
    System.out.println("upper  Frequency : ");
    for(int i =0; i<26; i++){
        if(upperfreq[i] > 0){
         System.out.println("frequency of " + (char)(i+ 'A') + " " + upperfreq[i] );
        }
    }
    System.out.println("Lower  Frequency : ");
    for(int i=0; i<26; i++){
        if(lowerfreq[i] > 0){
            System.out.println("frequency of " + (char)(i+'a')+" " + lowerfreq[i]);
        }
    }

}
}
// ch - 'a' → converts character to index (letter → number), used for storing frequency
// i + 'a' → converts index back to character (number → letter), used for printing