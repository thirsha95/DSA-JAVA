/*
===========================================================
Problem    : Stack Implementation using Command Parsing

Description:
Implement a Stack that processes multiple commands given as a
single input string. Each command is separated by commas.

Supported Commands:
- Enter X  -> Push X into the stack and print the pushed element
- peek     -> Print the top element without removing it
- DELETE   -> Remove and print the top element from the stack
- COUNT    -> Print the number of elements present in the stack

Pattern    : Stack + String Parsing

Approach   :
1. Read the complete input as a single line string.
2. Split the input string using comma (,).
3. Traverse each command using enhanced for loop.
4. Remove extra spaces using trim().
5. Split each command using space.
6. Use parts[0] to identify the command.
7. Use parts[1] only for Enter command value.
8. Perform the required Stack operation.

Key Idea   :
- parts[0] -> Command name
              (Enter, peek, DELETE, COUNT)

- parts[1] -> Value to push
              (only available for Enter command)

Stack Operations Used:
- push() -> Adds an element to the top of the stack
- peek() -> Returns the top element without removing it
- pop()  -> Removes and returns the top element
- size() -> Returns the number of elements in the stack

Time Complexity : O(n)
Space Complexity: O(n)

Sample Input:
Enter 101,Enter 102,peek,DELETE,COUNT

Execution:
Enter 101 -> Push 101
Enter 102 -> Push 102
peek      -> Print 102
DELETE    -> Remove and Print 102
COUNT     -> Print remaining stack size

Sample Output:
101
102
102
102
1

Input Format:
Take all commands as ONE LINE STRING.

===========================================================
*/
import java.util.*;
class StackImplementation {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] words = str.split(",");
    

    Stack<Integer> stack = new Stack<>();
    for(String  word : words){
           word = word.trim();
           String [] parts = word.split(" "); // anyway split is going to give array
           if(parts[0].equals("Enter")){
            int digit = Integer.parseInt(parts[1]);
            stack.push(digit);
            System.out.print(digit);
           }
           
           else if(parts[0].equals("peek")){     //   else if(word.equals("peek")){-->also valid!
            System.out.print(stack.peek());
           }

           else if(parts[0].equals("COUNT")){
            System.out.print(stack.size());
           }
    
           else if(parts[0].equals("DELETE")){
            System.out.print(stack.pop());
           }

        } 
    }

    }
