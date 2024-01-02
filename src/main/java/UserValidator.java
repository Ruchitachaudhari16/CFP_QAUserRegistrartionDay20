import java.util.regex.Pattern;

public class UserValidator {
    /* UC1:-As a User need to enter a valid FirstName
- First name starts with Cap and has minimum 3 characters*/
    private static final String FIRSTNAMEPATTERN = "^[A-Z]{1}[a-z]{3,}?";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRSTNAMEPATTERN);
        return pattern.matcher(fname).matches();
    }

    /* UC2-As a User need to enter a valid LastName
- Last name starts with Cap and has minimum 3 characters*/
    private static final String LASTNAMEPATTERN = "^[A-Z]{1}[a-z]{3,}?";

    public boolean validateLastName(String lname)
    {
        Pattern pattern=Pattern.compile(LASTNAMEPATTERN);
        return  pattern.matcher(lname).matches();
    }
}
