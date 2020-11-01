package uz.magichands.universaldictionary.payload;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank(message = "Telefon raqami kiritilishi shart!")
    private String username;
    @NotBlank(message = "Parol kiritilishi shart!")
    private String password;

    public LoginRequest(@NotBlank(message = "Telefon raqami kiritilishi shart!") String username,
                        @NotBlank(message = "Parol kiritilishi shart!") String password) {
        this.username = username;
        this.password = password;
    }

    public LoginRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
