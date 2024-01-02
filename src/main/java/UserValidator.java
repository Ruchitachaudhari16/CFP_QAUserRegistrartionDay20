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

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(LASTNAMEPATTERN);
        return pattern.matcher(lname).matches();
    }

    /* UC3:- As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
& co) and 2 optional (xyz & in) withprecise @ and . positions*/
    private static final String EmailPattern = "^[A-Za-z0-9]{3,}([.][a-zA-z]+)?[@][A-Za-z]+[.][A-Za-z]{2,3}([.][a-zA-Z]{2})?$";

    public boolean validateEmail(String email)
    {
        Pattern pattern=Pattern.compile(EmailPattern);
        return  pattern.matcher(email).matches();
    }
}
