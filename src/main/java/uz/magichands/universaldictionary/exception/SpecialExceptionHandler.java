package uz.magichands.universaldictionary.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SpecialExceptionHandler {

    @ExceptionHandler(ConfirmPasswordException.class)
    public ResponseEntity<?> confirmPasswordException(ConfirmPasswordException e) {
        ConfirmPasswordExceptionResponse response = new ConfirmPasswordExceptionResponse(e.getMessage());
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(ExistsUsernameException.class)
    public ResponseEntity<?> exitsUsernameException(ExistsUsernameException e) {
        ExistsUsernameExceptionResponse response = new ExistsUsernameExceptionResponse(e.getMessage());
        return ResponseEntity.badRequest().body(response);
    }
}
