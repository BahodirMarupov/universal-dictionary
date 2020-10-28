package uz.magichands.universaldictionary.exception;

public class ExistsUsernameException  extends  RuntimeException{
    public ExistsUsernameException(String message) {
        super(message);
    }
}
