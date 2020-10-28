package uz.magichands.universaldictionary.exception;

public class ConfirmPasswordExceptionResponse {
    private String confirmPassword;

    public ConfirmPasswordExceptionResponse(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
