import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void givenfirstName_whenProper_shouldReturnTrue() {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateFirstName("Ruchita");
        Assert.assertEquals(true,result);
    }
@Test
    public void givenfirstName_whenShort_shouldReturnFalse()
{
    UserValidator  userValidator=new UserValidator();
boolean result=userValidator.validateFirstName("er");
assertEquals(false, result);
}
}