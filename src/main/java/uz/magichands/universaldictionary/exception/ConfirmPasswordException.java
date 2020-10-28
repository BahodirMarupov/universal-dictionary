package uz.magichands.universaldictionary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ConfirmPasswordException extends RuntimeException {
    private String confirmPassword;

    public ConfirmPasswordException(String message) {
        super(message);
        this.confirmPassword = message;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
