
public abstract class Validator {
    private Validator nextValidator;

    public void setNext(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public boolean validate(String login, String password) {
        if (!doValidate(login, password)) {
            return false;
        }
        if (nextValidator != null) {
            return nextValidator.validate(login, password);
        }
        return true;
    }

    protected abstract boolean doValidate(String login, String password);
}