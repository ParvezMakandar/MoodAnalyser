package UserRegistration_day21;

@FunctionalInterface
public interface UserRegistrationInterface {
    public abstract boolean userEntries(String value) throws InvalidUserInputException;
}
