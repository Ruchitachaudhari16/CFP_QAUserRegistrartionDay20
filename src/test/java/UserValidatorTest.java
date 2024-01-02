import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    //Valid first name then it returns true

    @Test
    void givenfirstName_whenProper_shouldReturnTrue() {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateFirstName("Ruchita");
        Assert.assertEquals(true,result);
    }
@Test
    public void givenfirstName_whenShort_shouldReturnFalse() //Invalid firstname then it will return true.
{
    UserValidator  userValidator=new UserValidator();
boolean result=userValidator.validateFirstName("er");
assertEquals(false, result);
}
//Test case for valid lastname
    @Test
    public  void  givenlastName_whenProper_shouldReturnTrue()
    {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateLastName("Kale");
        assertEquals(true,result);
    }
    @Test
    public  void  givenlastName_whenShort_shouldReturnfalse()
    {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateLastName("Ka");
        assertEquals(false,result);
    }
    //Test case for email pattern
    @Test
    public void givenemail_whenProper_shouldReturnTrue()
    {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateEmail("abc.xyz@bl.co.in");
        assertEquals(true,result);
    }

   @Test
   public void givenemail_whenInvalid_shouldReturnFalse() //invalid email return true.
    {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateEmail("abc.xyzbl.co.in");
        assertEquals(false,result);
    }
    //Test case for mobileno
    @Test
    public void givenmobileno_WhenValid_shouldReturnTrue()
    {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateMobileNo("91 9234567890");
        assertEquals(true,result);
    }
    @Test
    public void givenmobileno_WhenInValid_shouldReturnfalse()
    {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateMobileNo("9109234567890");
        assertEquals(false,result);
    }

}