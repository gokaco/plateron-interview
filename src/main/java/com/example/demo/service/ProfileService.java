package com.example.demo.service;

import com.example.demo.model.request.RegisterChannelEvent;
import com.example.demo.model.request.RegisterProfileRequest;
import com.example.demo.model.response.RegisterProfileReponse;
import com.example.demo.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public void registerProfile(RegisterProfileRequest request) {
        profileRepository.saveProfile(request);
    }

    public RegisterProfileReponse getProfile() {
        return profileRepository.getProfile();
    }

}
