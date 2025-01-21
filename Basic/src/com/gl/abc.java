//String Challenge
//Have the function stringChallenge (str) take the stx parameter being passed which will be two times 
//(each properly formatted with a colon and am or pm) separated by a hyphen and 
//return the total number of minutes between the two times. The time will be in a 12 hour clock format. 
//		For example: if str is 9:00am-10:00am then the output should be 60. 
//		If str is 1:00pm-11:00am the output should be 1320.
//
//Examples
//Input: "12:30pm-12:00am"
//
//Output: 690
//
//Input: "1:23am-1:08am" Output: 1425

package com.gl;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
class abc {
    public static String englishTime(String input)
        throws ParseException
    {
       // Format of the date defined in the input String
        DateFormat dateFormat
            = new SimpleDateFormat("hh:mm:ss aa");
       
        // Change the pattern into 24 hour format
        DateFormat format
            = new SimpleDateFormat("HH:mm:ss");
        Date time = null;
        String output = "";
       
        // Converting the input String to Date
        time = dateFormat.parse(input);
       
        // Changing the format of date
        // and storing it in
        // String
        output = format.format(time);
        return output;
    }
 
    // Driver Code
    public static void main(String[] arg)throws ParseException
    {
        System.out.println(englishTime("07:05:45 PM"));
    }
}