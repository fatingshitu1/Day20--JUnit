import com.bridgelabz.UserRegex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class UserRegTest {
    @Test
    public void whenGivenValidFirstNameShouldReturnTrue(){
        boolean validName = UserRegex.validatefirstName("Shital");
        Assertions.assertEquals(true, validName);
    }
}



