import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
//Parameterised email test
class ValidEmailTestTest {

    @ParameterizedTest
    @MethodSource("input")
    public void given_parametrized_mail_should_return_as_per_result(String userInputEmail) {
        System.out.println("Email is valid or not:");
        assertTrue(ValidEmailTest.validateEmail(userInputEmail));
    }

    private static List<String> input() {
        return Arrays.asList(
                "shubhamsah097@gmail.com",
                "cruchita926@gmail.com",
                "abc@gmail.com",
                "cruchita926@gmail.com",
                "aditya.12@co.in",
                "acb.com"

        );
    }

    @Test
    public void given_prametrisedmail_should_return_as_per_result() {
        List<String> inputParameters = input();

        for (String userInputEmail : inputParameters) {
            System.out.println("Email: " + userInputEmail);
            assertTrue(ValidEmailTest.validateEmail(userInputEmail));
        }
    }
}
