package com.example.demo.controller;

import com.example.demo.model.request.RegisterChannelEvent;
import com.example.demo.model.request.RegisterProfileRequest;
import com.example.demo.model.response.RegisterProfileReponse;
import com.example.demo.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {


    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping("/v1/register-user")
    public void registerProfile(@RequestBody RegisterProfileRequest request) {
        profileService.registerProfile(request);
    }

    @GetMapping("/v1/user")
    public ResponseEntity<RegisterProfileReponse> getProfile() {
        return ResponseEntity.ok(profileService.getProfile());
    }


}
