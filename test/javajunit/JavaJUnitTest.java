
package javajunit;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


public class JavaJUnitTest {

    //For length
    @Test
    public void testCheckLengthGood() {
        System.out.println("8 Character is pass");
        String username = "Username";
        boolean expResult = true;
        boolean result = JavaJUnit.checkLength(username);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckLengthBad() {
        System.out.println("8 Character failed");
        String username = "user";
        boolean expResult = false;
        boolean result = JavaJUnit.checkLength(username);
        assertEquals(expResult, result);
    }
    

    //For upper
    
     @Test
    public void testCheckUpperGood() {
        System.out.println("One upper case pass");
        String username = "Username";
        boolean expResult = true;
        boolean result = JavaJUnit.checkUpper(username);
        assertEquals(expResult, result);
    }
    
   
 
}
