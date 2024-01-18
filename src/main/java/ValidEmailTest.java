import java.util.regex.Pattern;

public class ValidEmailTest {
    //Parameterised email test.
    public String userInputEmail;

    public ValidEmailTest(String userInputEmail) {
        this.userInputEmail = userInputEmail;
    }

    static final String paramemail = "[a-zA-Z0-9./%]+@[A-Za-z]+\\.[a-zA-Z]{2,}";

    public static boolean validateEmail(String mail) {
        Pattern pattern = Pattern.compile(paramemail);
        return pattern.matcher(mail).matches();
    }
}
