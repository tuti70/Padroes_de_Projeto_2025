public class UppercaseValidator extends Validator {
    @Override
    protected boolean doValidate(String login, String password) {
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Senha deve conter pelo menos uma letra maiúscula!");
            return false;
        }
        return true;
    }
}