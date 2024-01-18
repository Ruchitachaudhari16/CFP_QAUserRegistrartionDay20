/* import jdk.internal.foreign.SystemLookup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFieldValidationController {
    @RunWith(Parameterized.class)
    public class TestFieldValiationController {

        @Parameters(name = "{index}: {1} is valid email address = {0}")
        public static Iterable<Object> data() {
            return Arrays.asList(new Object[][] {
                    { true, "john@mycomp.com" },           { true,  "john123@mycomp.com" },
                    { true, "j+._%20_-brown@mycomp.com" }, { true,  "123@mycomp.com" },
                    { false, "john brown@mycomp.com" },    { false, "123@mycomp" },
                    { false, "john^brown@mycomp.com" },    { true , "1john@mycomp.com" },
                    { false, "john#brown@mycomp.com" },    { false, "john!brown@mycomp.com" },
                    { false, "john()brown@mycomp.com" },   { false, "john=brown@mycomp.com" },
                    { true,  "johñ.brown@mycomp.com" },    { false, "john.brown@mycomp.coñ" },
                    { true,  "johú@mycomp.com" },          { true,  "johíáó@mycomp.com" }
            });
        }

        private boolean expected;
        private String emailAddress;

        public TestFieldValiationController(boolean expected, String emailAddress) {
            this.expected = expected;
            this.emailAddress = emailAddress;
            TestServiceUtil.getInstance();
        }

        @Test
        public void validateEmail() {
            assertEquals(expected, FieldValidationController.getInstance().validateEmail}*/
