
/*
=========================================================
Problem: Check Every Substring Has Unique Characters
Category: Strings
Difficulty: Medium

Description:
Given a string, generate every possible substring and
check whether all of its characters are unique.
Print only the substrings that contain no duplicate
characters.

Approach:
1. Generate every possible substring.
2. For each starting index, create a HashSet<Character>.
3. Extend the substring one character at a time.
4. If the current character already exists in the HashSet,
   stop extending that substring (break).
5. Otherwise, add the character to the HashSet and print
   the current substring.

Time Complexity: O(n²)
Space Complexity: O(n)

Example:
Input:
abca

Output:
a
ab
abc
b
bc
bca
c
ca


/*
Sample Input:
abca

Sample Output:
Start at i = 0

Create an empty HashSet.

j = 0
Character = 'a'
Substring = "a"
Set = {a}
Unique ✓

j = 1
Character = 'b'
Substring = "ab"
Set = {a, b}
Unique ✓

j = 2
Character = 'c'
Substring = "abc"
Set = {a, b, c}
Unique ✓

j = 3
Character = 'a'
Substring = "abca"
'a' is already in the set.
Set = {a, b, c}
Not Unique ✗

Unique substrings from index 0:
a
ab
abc

Not Unique substring:
abca
*/



import java.util.*;
public class UniqueSubstrings {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean found = false; // not found any repeating character

        for(int i=0; i<str.length(); i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i; j<str.length(); j++){
                char ch = str.charAt(j);
                if(set.contains(ch)){
                    found = true; // found repeating character
                    System.out.println(str.substring(i, j + 1) + " -> Not Unique");
                    break;
                }
                set.add(ch);
                System.out.println(str.substring(i,j+1)  +" -> unique ");
            }
        }
         System.out.print(found);
    }
}
