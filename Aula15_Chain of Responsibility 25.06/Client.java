public class Client {
    public Validator createValidationChain() {
        Validator loginExists = new LoginExistsValidator();
        Validator uppercase = new UppercaseValidator();
        Validator lowercase = new LowercaseValidator();
        Validator specialChar = new SpecialCharValidator();
        Validator number = new NumberValidator();
        Validator consecutiveNumbers = new ConsecutiveNumbersValidator();
        Validator lengthMin = new LengthMinValidator();
        Validator lengthMax = new LengthMaxValidator();

        loginExists.setNext(uppercase);
        uppercase.setNext(lowercase);
        lowercase.setNext(specialChar);
        specialChar.setNext(number);
        number.setNext(consecutiveNumbers);
        consecutiveNumbers.setNext(lengthMin);
        lengthMin.setNext(lengthMax);

        return loginExists;
    }
}