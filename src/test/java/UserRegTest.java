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
}



