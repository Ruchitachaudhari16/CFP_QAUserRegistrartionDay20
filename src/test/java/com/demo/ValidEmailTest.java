package com.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidEmailTest {
    public String emailTest;
    public boolean expectedEmailTest;

    public ValidEmailTest(String emailTest, boolean expectedEmailTest) {
        this.emailTest = emailTest;
        this.expectedEmailTest = expectedEmailTest;
    }


    public static Collection Data() {
        return Arrays.asList(new Object[][]
                {{true, "abc@yahoo.com"}, {true, "abc-100@yahoo.com"},
                        {true, "abc.100@yahoo.com"}, {true, "abc111@abc.com"},
                        {true, "abc-100@abc.com"}, {true, "abc.100@abc.com.au"},
                        {true, "abc@1.com"}, {true, "abc@gmail.com.com"},
                        {true, "abc+100@gmail.com"}

                });


  /*  @Test
    public void validateUsingParametresEmail() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator. validetemail("ruch@coin");
        boolean resultemail = email.validateEmail();
        Assert.assertEquals(expectedEmailTest, result);
    }
*/

    }
}