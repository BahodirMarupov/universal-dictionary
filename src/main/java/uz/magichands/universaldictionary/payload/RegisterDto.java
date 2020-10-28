package uz.magichands.universaldictionary.payload;

import javax.validation.constraints.NotBlank;

public class RegisterDto {
    @NotBlank(message = "Ism kiritilishi shart!")
    private String firstName;

    private String lastName;

    @NotBlank(message = "Telefon raqamni kiritilishi shart!")
    private String phoneNumber;

    @NotBlank(message = "Parol kiritilishi shart!")
    private String password;

    private String confirmPassword;

    private String bio;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
