import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegTest {

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
