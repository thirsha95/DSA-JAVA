/*Program: Count Difference Between '*' and '#'

Problem:
Given a string containing only '*' and '#', find the difference between their counts.

Description:
Count '*' and '#' characters.

Output Rules:
* > #  -> Positive
* < #  -> Negative
* = #  -> 0

Examples:
***##  -> 3-2 = 1
##***# -> 3-3 = 0
####** -> 2-4 = -2

Formula:
Answer = count('*') - count('#')
*/
package Strings.Medium;
import java.util.Scanner;

public class Hashandstar {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int res;
        int star = 0;
        int hash = 0;
        for(int i=0; i<str.length(); i++){
           if(str.charAt(i)=='*') star++;
           else if(str.charAt(i)=='#') hash++;
    }
    if(star > hash ){
        res = star - hash ;
    }else if (hash > star) {
        res = star - hash;
    }else{
        res=0;
    }
    System.out.println(res);
}
}