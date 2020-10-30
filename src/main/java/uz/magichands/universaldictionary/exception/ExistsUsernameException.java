package uz.magichands.universaldictionary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ExistsUsernameException  extends  RuntimeException{
    public ExistsUsernameException(String message) {
        super(message);
    }
}
