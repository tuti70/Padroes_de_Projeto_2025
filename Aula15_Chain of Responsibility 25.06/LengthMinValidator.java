public class LengthMinValidator extends Validator {
    @Override
    protected boolean doValidate(String login, String password) {
        if (password.length() < 8) {
            System.out.println("Senha deve ter pelo menos 8 caracteres!");
            return false;
        }
        return true;
    }
}