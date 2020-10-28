package uz.magichands.universaldictionary.exception;

public class ExistsUsernameExceptionResponse {
    private String phoneNumber;

    public ExistsUsernameExceptionResponse(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
