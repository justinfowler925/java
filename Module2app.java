//Justin Fowler, X436.2 Module 2 Code

package module2app;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Module2app {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        // Prompt user for total number of strings that will be entered
        BufferedReader stdin = 
            new BufferedReader(new InputStreamReader(System.in), 1);
            System.out.println("Enter Number of strings to sort: ");
            int stringTotal = Integer.parseInt(stdin.readLine());
            System.out.println("Next you will enter each string ");
            
        // User inputs each string individually, captured into array
        int userInputCounter = 1;
        String[] userInputArray = new String[stringTotal];
            for(int i = 0; i < userInputArray.length; i++){
            
                BufferedReader userTempInput =  
                new BufferedReader (new InputStreamReader(System.in), 1);
                System.out.println("Enter string " + (userInputCounter ++));
                userInputArray[i] = (userTempInput.readLine());
                System.out.println("You entered: " + userInputArray[i]);
                
            }
              
        stdin.close();
            
        //TODO Strings compared to or arranged in alphabetical order
    
        //TODO Print each string to console
            
    }
    
}
