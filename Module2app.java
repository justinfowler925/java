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
        
        //Strings in array compared to each other|arranged aA-zZ
        String sortTemp;
        boolean wasSwaped = true;
            for (int index1 = 0; index1 < userInputArray.length - 1 && wasSwaped; ++index1) {
                wasSwaped = false;
                for (int index2 = 0; index2 < userInputArray.length - index1 - 1; ++index2) {
                    if (userInputArray[index2].compareToIgnoreCase(userInputArray[index2+1]) > 0) {
                        sortTemp = userInputArray[index2];
                        userInputArray[index2] = userInputArray[index2+1];
                        userInputArray[index2+1] = sortTemp;
                        wasSwaped = true;
            }
        }
    }
        for (int j=0; j<stringTotal; j++)
            System.out.println(userInputArray[j]);
        stdin.close();
            
        
    
        //TODO Print each string to console
            
    }
    
}
