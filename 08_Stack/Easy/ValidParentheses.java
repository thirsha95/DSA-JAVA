/*
 
 *
 * Problem:
 * Valid Parentheses (LeetCode 20)
 *
 * Pattern:
 * Stack (Matching Brackets)
 *
 * Problem Statement:
 * Given a string containing brackets,
 * determine if the brackets are valid.
 *
 * A valid string means:
 * - Every opening bracket has a matching closing bracket.
 * - Brackets are closed in the correct order.
 *
 * Sample Input
 * ({[]})
 *
 * Sample Output 
 * True
 *
 * Sample Input 
 * ([)]
 *
 * Sample Output 
 * False
 *
 *
 * Algorithm:
 *
 * 1. Create an empty Stack.
 *
 * 2. Traverse each character of the string.
 *
 * 3. If the character is an opening bracket:
 *    - Push its matching closing bracket into the stack.
 *
 *    Example:
 *    '(' -> ')'
 *    '{' -> '}'
 *    '[' -> ']'
 *
 * 4. If the character is a closing bracket:
 *    - Check if stack is empty.
 *    - Pop the top element.
 *    - Compare it with current character.
 *    - If not matching, return false.
 *
 * 5. After traversal:
 *    - If stack is empty, return true.
 *    - Otherwise, return false.
 *
 *
 * Dry Run:
 *Stack follows LIFO (Last In First Out).
 * Input:
 * ({[]})
 *
 * (
 * Stack: )
 *
 * {
 * Stack: ) }
 *
 * [
 * Stack: ) } ]
 *
 * ]
 * Pop ] -> Match
 *
 * }
 * Pop } -> Match
 *
 * )
 * Pop ) -> Match
 *
 * Stack empty
 *
 * Output:
 * True
 *
 *
 * Key Idea:
 *
 * Opening bracket:
 *        ↓
 * Push expected closing bracket
 *
 * Closing bracket:
 *        ↓
 * Pop and compare
 *
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */

 import java.util.*;
public class ValidParentheses {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      Stack<Character> stack = new Stack<>();
     for(char ch : str.toCharArray()){
         if(ch =='(') stack.push(')');
         else if(ch=='{') stack.push('}');
         else if(ch=='[') stack.push(']');
         else if( stack.isEmpty() || ch != stack.pop()){
            System.out.print("False");
            return;
         }
     }
     System.out.print(stack.isEmpty() ? "True" : "False"); // if stack contains brackets it is not valid so false
     // Example: "((("
    // Stack contains expected closing brackets because opening brackets are not closed.
  
    }
}
