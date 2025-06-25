public class LengthMaxValidator extends Validator {
    @Override
    protected boolean doValidate(String login, String password) {
        if (password.length() > 16) {
            System.out.println("Senha não pode ter mais de 16 caracteres!");
            return false;
        }
        return true;
    }
}