public class SpecialCharValidator extends Validator {
    @Override
    protected boolean doValidate(String login, String password) {
        if (!password.matches(".*[@#$%&*].*")) {
            System.out.println("Senha deve conter pelo menos um caractere especial (@, #, $, %, &, *)!");
            return false;
        }
        return true;
    }
}