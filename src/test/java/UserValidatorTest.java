import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    //Valid first name then it returns true

    @Test
    void givenfirstName_whenProper_shouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Ruchita");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenfirstName_whenShort_shouldReturnFalse() //Invalid firstname then it will return true.
    {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("er");
        assertEquals(false, result);
    }

    //Test case for valid lastname
    @Test
    public void givenlastName_whenProper_shouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Kale");
        assertEquals(true, result);
    }

    @Test
    public void givenlastName_whenShort_shouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Ka");
        assertEquals(false, result);
    }

    //Test case for email pattern
    @Test
    public void givenemail_whenProper_shouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc.xyz@bl.co.in");
        assertEquals(true, result);
    }

    @Test
    public void givenemail_whenInvalid_shouldReturnFalse() //invalid email return true.
    {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc.xyzbl.co.in");
        assertEquals(false, result);
    }

    //Test case for mobileno
    @Test
    public void givenmobileno_WhenValid_shouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNo("91 9234567890");
        assertEquals(true, result);
    }

    @Test
    public void givenmobileno_WhenInValid_shouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNo("9109234567890");
        assertEquals(false, result);
    }

    //UC5:- Rule1 Password Testcase
    @Test
    public void givenpassword_WhenValid_shouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Ruchita123");
        assertEquals(true, result);
    }

    @Test
    public void givenpassword_WhenInvalid_shouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("uchita");
        assertEquals(false, result);
    }

    //Test case for Rule2 Password
    @Test
    public void givenpass_WhenValid_shouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePass("Ruchita13");
        assertEquals(true, result);
    }

    @Test
    public void givenpass_WhenInValid_shouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePass("uchita13");
        assertEquals(false, result);
    }
//Test for atleast one numeric value

    @Test
    public void givenpas_WhenValid_shouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validPass("Ruchita1");
        assertEquals(true, result);
    }

    @Test
    public void givenpas_WhenInValid_shouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validPass("Ruchita");
        assertEquals(false, result);
    }

    //Test for atleast one special character
    @Test
    public void givenpassw_WhenValid_shouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validPassw("Ruchi@23");
        assertEquals(true, result);
    }

    @Test
    public void givenpassw_WhenInValid_shouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validPassw("ruchi@23");
        assertEquals(false, result);
    }

    //Test case for email
    @Test
    public void givenemail_WhenValid_shouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validemail("ruch123@co.in");
        assertEquals(true, result);
    }

    @Test
    public void givenemail_WhenInValid_shouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validemail("ruch@coin");
        assertEquals(false, result);
    }

}