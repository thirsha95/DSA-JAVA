package Math;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();// how many series you want
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.print(a);
       System.out.print(b);
       for(int i=2; i<n; i++){
        int next = a + b;
         System.out.print(next);
          a = b;
          b = next;
       }
      
    }
}
