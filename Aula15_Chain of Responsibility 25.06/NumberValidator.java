public class NumberValidator extends Validator {
    @Override
    protected boolean doValidate(String login, String password) {
        if (!password.matches(".*\\d.*")) {
            System.out.println("Senha deve conter pelo menos um número!");
            return false;
        }
        return true;
    }
}