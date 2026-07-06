/*
Problem: Medio-cine Distribution

A new medicine is to be distributed to N people. Each person requires exactly 1 capsule.
There are L capsules available per day.

People are divided into:
- High risk: age 0–10 OR age >= 81
- Non-high risk: all others

Rules:
1. Each day, medicine can be given to ONLY ONE group (either high risk OR non-high risk).
2. High risk patients must be treated first.
3. At most L capsules can be distributed per day.

Task:
Find the minimum number of days required to distribute medicine to all N people.
Find the minimum number of days required to medicate all the N humans.

/*
INPUT:
5 2
11 81 27 72 79

OUTPUT:
3 Days

EXPLANATION:
High risk ages = 81 → 1 person
Normal ages = 11, 27, 72, 79 → 4 people

L = 2 medicines per day

High risk days = ceil(1 / 2) = 1 day
Normal days = ceil(4 / 2) = 2 days

Total days = 1 + 2 = 3 Days
*/

package Arrays.Easy;
import java.util.*;
public class MedioCineDistribution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int highrisk = 0;
        int lowrisk = 0;
        for(int i=0; i<n; i++){
            if(arr[i] <= 10 || arr[i]>=81){
                highrisk++;
            }else{
                lowrisk++;
            }
        }
      //  This is a mathematical trick to compute CEIL of N/L using integer arithmetic: ceil(N / L) = (N + L - 1) / L
     // Because integer division in Java truncates (floors) the result,
    //we add (L - 1) to N so that any remainder pushes the value to the next integer.    
      
      int highriskDays = (highrisk + l - 1)/l; //first complete high risk days
      int lowriskDays =(lowrisk + l -1)/l; // then go for lowrisk days
        System.out.println("TOTAL DAYS : " + (highriskDays +lowriskDays) );
    }
    
}
/*
In Java, division between two integers (int/int) gives FLOOR result automatically (decimal is removed).
If at least one value is double (double/int), result becomes decimal, so CEIL/FLOOR must be applied manually.
*/

//int days = (int) Math.ceil((double) n / l);

//or Math.ceil((int)(highrisk/(float)/l))
//  Math.ceil((int)(lowrisk/(float)/l))

/*
FLOOR → Rounds DOWN to nearest smaller integer (drops decimal part)

2.5 is a decimal number (fractional value).
FLOOR(2.5) = 2   → rounds DOWN
CEIL(2.5)  = 3   → rounds UP

Example:
5 / 2 = 2   (floor, decimal .5 is removed)

CEIL  → Rounds UP to nearest larger integer (next whole number if decimal exists)

Example:
5 / 2 = 3   (ceil, because .5 forces rounding up)
*/
