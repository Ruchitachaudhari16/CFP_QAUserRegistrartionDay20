import java.util.function.Function;

public class ValidLambdaexp {
    //UserRegistration using a Lambda Expression for a first name
    public static boolean firstNameValidation() throws CustomException {
        String firstName = "Ruchita";
        //Lambda expression for firstName.
        Function<String, Boolean> validateFirstName = name -> name.matches("^[A-Z]{1}[a-z]{3,}?$");
        if (validateFirstName.apply(firstName)) {
            System.out.println("First Name is valid: " + validateFirstName.apply(firstName));
            return true;
        }

        throw new CustomException("Invalid first name");
    }

    public static boolean lastNameValidation() throws CustomException {
        String lastName = "Chaudhari";
        Function<String, Boolean> validateFirstName = name -> name.matches("^[A-Z]{1}[a-z]{2,}$");
        if (validateFirstName.apply(lastName)) {
            System.out.println("Last Name is valid: " + validateFirstName.apply(lastName));
            return true;
        }
        throw new CustomException("Invalid last name");
    }

    public static boolean emailValidation() throws CustomException {
        String email = "ruc.hita@bl.co.in";
        Function<String, Boolean> validateEmail = name -> name.matches("^[A-Za-z0-9]{3,}([.][a-zA-z]+)?[@][A-Za-z]+[.][A-Za-z]{2,3}([.][a-zA-Z]{2})?$");
        if (validateEmail.apply(email)) {
            System.out.println("Email is valid: " + validateEmail.apply(email));
            return true;
        }
        throw new CustomException("Invalid email");
    }

    public static boolean preDefinedMobileNumber() throws CustomException {
        String mobile = "91 9356761234";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^[+]?[0-9]{2}[ ][0-9]{10}$");
        if (validateMobileNumber.apply(mobile)) {
            System.out.println("Mobile number is valid: " + validateMobileNumber.apply(mobile));
            return true;
        }
        throw new CustomException("Invalid mobile number");
    }

    public static boolean preDefinedPasswordRule1() throws CustomException {
        String password = "Ruch@12334";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^[0-9A-Za-z@#$%&!]{8,}$");
        if (validateMobileNumber.apply(password)) {
            System.out.println("Password is valid: " + validateMobileNumber.apply(password));
            return true;
        }
        throw new CustomException("Invalid password");
    }

    public static boolean preDefinedPasswordRule2() throws CustomException {
        String password2 = "Ruchi9@1234";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^[A-Z]{1}[0-9A-Za-z@#$%&!]{8,}$");
        if (validateMobileNumber.apply(password2)) {
            System.out.println("Password is valid: " + validateMobileNumber.apply(password2));
            return true;
        }
        throw new CustomException("Invalid password");
    }

    public static boolean preDefinedPasswordRule3() throws CustomException {
        String password3 = "Ruchita1234";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^(?=.*?[A-Z])(?=.*?[0-9])[0-9A-Za-z@#$%&!]{8,}$");
        if (validateMobileNumber.apply(password3)) {
            System.out.println("Password is valid: " + validateMobileNumber.apply(password3));
            return true;
        }
        throw new CustomException("Invalid password");
    }

    public static boolean preDefinedPasswordRule4() throws CustomException {
        String password4 = "Ka7huyK79#A";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^(?=[a-zA-Z0-9#@$?-_]{8,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).*$");
        if (validateMobileNumber.apply(password4)) {
            System.out.println("Password is valid: " + validateMobileNumber.apply(password4));
            return true;
        }
        throw new CustomException("Invalid password");
    }

    public static boolean emailSamplesValidation() throws CustomException {
        String[] inputs = {"abc.xyz@bl.co.in", "yhz.out&kl.co.in", "abc.ykj@bl.co.ik", "ruchita@gmail.com"};

        for (String input : inputs) {
            Function<String, Boolean> validateEmail = email -> email.matches("^[0-9A-Za-z]+[.+_-]{0,1}[0-9A-Za-z]+[@][A-Za-z]+[.][a-z]{2,3}([.][a-z]{2,3}){0,1}$");
            if (validateEmail.apply(input)) {
                System.out.println(input + " : is valid: " + validateEmail.apply(input));
                //return true;
            } else {
                System.out.println(input + " : is invalid: " + validateEmail.apply(input));
            }
        }
        throw new CustomException("Invalid email");

    }


    public static void main(String[] args) throws CustomException {

        ValidLambdaexp ve=new ValidLambdaexp();
        firstNameValidation();
        lastNameValidation();
        emailValidation();
        preDefinedMobileNumber();
        preDefinedPasswordRule1();
        preDefinedPasswordRule2();
        preDefinedPasswordRule3();
        preDefinedPasswordRule4();
        emailSamplesValidation();

    }
}
