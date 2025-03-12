package com.example.spring_boot_validations.users;

import com.example.spring_boot_validations.validators.UniqueEmailValidator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "This field should not be blank")
    private String userName;
    @NotBlank(message = "This field should not be blank")
    @UniqueEmailValidator(message = "Email should be unique")
    private String email;
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
