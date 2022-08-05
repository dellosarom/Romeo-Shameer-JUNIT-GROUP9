package javajunit;

import java.util.Scanner;

/**
 *
 * @author romeodellosa
 */
public class JavaJUnit {


    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
           System.out.println("Enter a Username");
           String user = input.nextLine();
           
           if(checkLength(user) != true){
               System.out.println("Username atleast 8 character and 1 Uppercase");
           }
    }
    
   
    public static boolean checkLength (String username){
        if(username.length() >= 8)
            return true;
        else
            return false;
    }
    
    public static boolean checkUpper(String username){
        boolean isUpper = false;
        for(int i = 0; i < username.length(); i++)
                if( Character.isUpperCase(username.charAt(i)))
                {
                    isUpper = true;
                        return isUpper;
                }
        return isUpper;
    }
   
}