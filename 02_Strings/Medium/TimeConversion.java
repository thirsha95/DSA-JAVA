/*
 * Time Conversion
 *
 * Problem:
 * Convert a time from 12-hour AM/PM format to 24-hour format.
 *
 * Pattern:
 * String Manipulation
 *
 * Concepts Used:
 * - substring() : Extract parts of String
 * - Integer.parseInt() : Convert String to int
 * - String.format() : Format output with leading zero
 * - Conditional statements
 *
 * Logic:
 * AM:
 * - 1 AM to 11 AM -> Same as 24-hour format
 * - 12 AM -> Convert to 00
 *
 * PM:
 * - 1 PM to 11 PM -> Add 12
 * - 12 PM -> Remains 12
 *
 * Example:
 * Input:
 * 07:05:45PM
 *
 * Output:
 * 19:05:45
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.*;
public class TimeConversion {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    String period = str.substring(8,10);      // Extract AM or PM
    int hour = Integer.parseInt(str.substring(0,2));   // Extract hour and convert String hour to integer

    if(period.equals("AM")){
        if(hour == 12){
            hour =0;
        }
    }
    else{
        if( hour != 12){
            hour = hour + 12;
        }
    }
        

    
    String res  = String.format("%2d", hour) + str.substring(2,8);  // Add minutes and seconds (remove AM/PM part)
    System.out.print(res);

}
}
            // AM times are already same as 24-hour format
            // Example: 09:30:00AM -> 09:30:00
            // Only special case: 12 AM means midnight
            // 12:30:00AM -> 00:30:00

            // PM times need +12 to convert to 24-hour format
            // Example: 07:00:00PM -> 19:00:00
            // Exception: 12 PM is already same in 24-hour format
            // 12:30:00PM -> 12:30:00