package com.amrendra.AllMyLinks.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name shouldn't be empty")
    @Pattern(regexp = "^[A-Z][a-z]$",message="First letter should be capital and rest small letters.")
    private String name;
    @NotBlank(message = "Email shouldn't be empty")
    @Pattern(regexp = "^[a-z]{0,9}+@[a-z]+.\\[a-z]$")
    private String email;
    @NotBlank(message = "Password shouldn't be empty")
    @Size(min=4, max=12 )
    @Pattern(regexp = "[a-zA-Z]{0,9}[*$#&%@]", message = "Combination of letters,numbers and special chars")
    private String password;

    @Enumerated
    private UserRole role;

    public enum UserRole {
        Admin, user, third_party;
    }

    public UserRole getRole() {
        return role;
    }
    public void setRole(UserRole role) {
        this.role = role;
    }

    public User() {
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
