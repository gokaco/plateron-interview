package com.example.demo.repository;

import com.example.demo.model.request.RegisterChannelEvent;
import com.example.demo.model.request.RegisterProfileRequest;
import com.example.demo.model.response.RegisterProfileReponse;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileRepository {

    private String firstName;
    private String lastName;

    public void saveProfile(RegisterProfileRequest request) {
        this.firstName = request.getFirstName();
        this.lastName = request.getLastName();
    }

    public RegisterProfileReponse getProfile() {
        return new RegisterProfileReponse(firstName, lastName);
    }
}
