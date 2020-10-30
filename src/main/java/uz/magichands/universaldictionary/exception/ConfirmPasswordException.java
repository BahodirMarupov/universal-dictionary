package uz.magichands.universaldictionary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ConfirmPasswordException extends RuntimeException {
    public ConfirmPasswordException(String message) {
        super(message);
    }
}
