package com.ducvu.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(min=5,max = 45)
    private String firstName;
    @NotBlank
    @Size(min=5,max = 45)
    private String lastName;
    @NotBlank
    @Pattern(regexp="^(09|01[2|6|8|9])+([0-9]{8})\b$", message = "Phone number format is incorrect")
    private String phone;
    @NotBlank
    @Email
    private String email;
    @NotNull
    @Min(18)
    private Integer age;
    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
