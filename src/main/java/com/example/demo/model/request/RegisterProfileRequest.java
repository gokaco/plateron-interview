package com.example.demo.model.request;

public class RegisterProfileRequest {

    private String firstName;
    private String lastName;

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

    public RegisterProfileRequest() {
    }

    public RegisterProfileRequest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
