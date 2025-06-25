public class ConsecutiveNumbersValidator extends Validator {
    @Override
    protected boolean doValidate(String login, String password) {
        for (int i = 0; i < password.length() - 2; i++) {
            char c1 = password.charAt(i);
            char c2 = password.charAt(i + 1);
            char c3 = password.charAt(i + 2);

            if (Character.isDigit(c1) && Character.isDigit(c2) && Character.isDigit(c3)) {
                if (c1 + 1 == c2 && c2 + 1 == c3) {
                    System.out.println("Senha não pode conter 3 números consecutivos em sequência!");
                    return false;
                }
            }
        }
        return true;
    }
}