import org.junit.Test;

import java.util.regex.Pattern;

public class UserValidator {
    /* UC1:-As a User need to enter a valid FirstName
- First name starts with Cap and has minimum 3 characters*/
    private static final String FIRSTNAMEPATTERN = "^[A-Z]{1}[a-z]{3,}?$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRSTNAMEPATTERN);
        return pattern.matcher(fname).matches();
    }

    /* UC2-As a User need to enter a valid LastName
- Last name starts with Cap and has minimum 3 characters*/
    private static final String LASTNAMEPATTERN = "^[A-Z]{1}[a-z]{3,}?$";

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(LASTNAMEPATTERN);
        return pattern.matcher(lname).matches();
    }

    /* UC3:- As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
& co) and 2 optional (xyz & in) withprecise @ and . positions*/
    private static final String EmailPattern = "^[A-Za-z0-9]{3,}([.][a-zA-z]+)?[@][A-Za-z]+[.][A-Za-z]{2,3}([.][a-zA-Z]{2})?$";

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EmailPattern);
        return pattern.matcher(email).matches();
    }

    /* UC4:-As a User need to follow pre-defined
Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number*/
    private static final String MobileNoPattern = "^[+]?[0-9]{2}[ ][0-9]{10}$";

    public boolean validateMobileNo(String mobileno) {
        Pattern pattern = Pattern.compile(MobileNoPattern);
        return pattern.matcher(mobileno).matches();
    }

    /*UC5:- As a User need to follow pre-defined
Password rules.Rule1– minimum 8Characters - NOTE – All rules must be passed*/
    private static final String PasswordPattern = "^[0-9A-Za-z@#$%&!]{8,}$";

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PasswordPattern);
        return pattern.matcher(password).matches();
    }

    /* UC6:-Rule2– Should have at least 1 Upper Case - NOTE – All rules must be passed*/
    private static final String PasswordPat = "^[A-Z]{1}[0-9A-Za-z@#$%&!]{8,}$";

    public boolean validatePass(String passwo) {
        Pattern pattern = Pattern.compile(PasswordPat);
        return pattern.matcher(passwo).matches();
    }

    /* UC7:-Rule3– Should have at least 1 numeric number inthe password - NOTE – All rules must be passed*/
    private static final String PassPattern = "^(?=.*?[A-Z])(?=.*?[0-9])[0-9A-Za-z@#$%&!]{8,}$";

    public boolean validPass(String pass) {
        Pattern pattern = Pattern.compile(PassPattern);
        return pattern.matcher(pass).matches();
    }

    /* UC8- Rule4 – Has exactly 1 Special Character  NOTE – All rules must be passed
    Atleast one special character */
    private static final String PPattern = "^(?=[a-zA-Z0-9#@$?-_]{8,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).*$";

    public boolean validPassw(String passw) {
        Pattern pattern = Pattern.compile(PPattern);
        return pattern.matcher(passw).matches();
    }

    /*UC 9:-Validate email samples*/
    static final String email = "^[0-9A-Za-z]+[.+_-]{0,1}[0-9A-Za-z]+[@][A-Za-z]+[.][a-z]{2,3}([.][a-z]{2,3}){0,1}$";

    public boolean validemail(String mail)
    {
        Pattern pattern = Pattern.compile(email);
        return pattern.matcher(mail).matches();
    }
    //Validate email using parameterised method
    static final String valemail = "^[0-9A-Za-z]+[.+_-]{0,1}[0-9A-Za-z]+[@][A-Za-z]+[.][a-z]{2,3}([.][a-z]{2,3}){0,1}$";

    public boolean validetemail(String mail)
    {
        Pattern pattern = Pattern.compile(valemail);
        return pattern.matcher(mail).matches();
    }
}