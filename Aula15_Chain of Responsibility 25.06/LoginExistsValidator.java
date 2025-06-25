import java.util.Arrays;
import java.util.List;

public class LoginExistsValidator extends Validator {
    private List<String> validLogins = Arrays.asList("admin", "user", "guest");

    @Override
    protected boolean doValidate(String login, String password) {
        if (!validLogins.contains(login)) {
            System.out.println("Login não cadastrado!");
            return false;
        }
        return true;
    }
}