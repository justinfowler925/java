// Justin Fowler, X436.2 Module 3 Code

package module3app;
import java.util.*;

public class Module3app {
    public static void main(String[] args) {
        
        //use scanner class to handle user input
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String stringToReverse = reader.next();
        
        //confirm entry to user
        System.out.println("You entered: " + stringToReverse);
        System.out.println(" Now we flip it");
        
        //call recursive function to flip string around and print to screen
        System.out.println(reverse(stringToReverse));
        
    }
        
    // call recursive function
    public static String reverse(String stringToReverse){
        
        if (stringToReverse.length() == 0)
             return stringToReverse;
        
        //we use substring to reverse all but the last charactor - then add the two and return
        String tempString = stringToReverse.charAt(stringToReverse.length()-1) + reverse(stringToReverse.substring(0,stringToReverse.length()-1));
        return tempString;
        }
}