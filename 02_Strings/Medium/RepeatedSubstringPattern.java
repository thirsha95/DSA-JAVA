/*
===========================================================
Problem: Repeated Substring Pattern
Platform: LeetCode 459
Difficulty: Medium
Approach: Brute Force + StringBuilder
Time Complexity: O(n²)
Space Complexity: O(n)

Description:
Given a string s, determine whether it can be constructed by
taking a substring of it and appending multiple copies of the
substring together.

Example 1:
Input:
s = "abab"

Output:
true

Explanation:
The substring "ab" repeated 2 times forms "abab".

-----------------------------------------------------------

Example 2:
Input:
s = "aba"

Output:
false

Explanation:
No substring can be repeated multiple times to form "aba".

-----------------------------------------------------------

Example 3:
Input:
s = "abcabcabc"

Output:
true

Explanation:
The substring "abc" repeated 3 times forms "abcabcabc".

-----------------------------------------------------------

Algorithm:

1. Find the string length.
2. Try every possible substring length.
3. Skip invalid lengths.
4. Take the first 'len' characters.
5. Repeat it until the string length becomes 'n'.
6. Compare with the original string.
7. Return true if matched, otherwise continue.
8. Return false if no match is found.
-----------------------------------------------------------

Algorithm (Brute Force)

Example:
s = "abab"

Try len = 1
part = "a"
Repeat: "aaaa"
Not equal

Try len = 2
part = "ab"
Repeat: "abab"
Equal → Return true


===========================================================
*/
import java.util.*;
public class RepeatedSubstringPattern {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

 
    int n = str.length();
    boolean found = false;
    for(int len=1; len<=n/2; len++){   // If the length cannot divide the string completely,
          if(n % len !=0){           // it cannot form the original string. leftover character exists
          continue;
        }
      String subparts = str.substring(0,len);
      StringBuilder sb = new StringBuilder();  // Build a new string by repeating the substring
      while(sb.length() < n){
          sb.append(subparts);
    }
    if(sb.toString().equals(str)){  // Compare with the original string
          found = true;
          break;
    }
}
 System.out.print(found);   
}
}
