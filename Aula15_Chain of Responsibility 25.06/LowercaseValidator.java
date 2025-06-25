public class LowercaseValidator extends Validator {
    @Override
    protected boolean doValidate(String login, String password) {
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Senha deve conter pelo menos uma letra minúscula!");
            return false;
        }
        return true;
    }
}