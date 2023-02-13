import com.bridgelabz.UserRegex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegTest {
    @Test
    public void whenGivenValidFirstNameShouldReturnTrue(){
        boolean validName = UserRegex.validatefirstName("Shital");
        Assertions.assertEquals(true, validName);
    }
    @Test
    public void whenGivenValidLastNameShouldReturnTrue(){
        boolean validLastName = UserRegex.validatelastName("Fating");
        Assertions.assertEquals(true, validLastName);
    }
    @Test
    public void whenGivenValidEmailShouldReturnTrue(){
        boolean validEmail = UserRegex.validateemail("Shitalfating@gmail.com");
        Assertions.assertEquals(true, validEmail);
  }
    @Test
    public void whenGivenValidMobileNumberShouldReturnTrue() {
        boolean validateMobileNumber = UserRegex.validateMobileNumber("92 84774178");
        Assertions.assertEquals(true, validateMobileNumber);
    }
//
//    @Test
//    public void whenGivenValidPasswordShouldReturnTrue() {
//        boolean validatePassword = UserRegex.validatePassword("Shital@123");
//        Assertions.assertEquals(true, validatePassword);
//    }
}




