package com.example.demo.controller;

import com.example.demo.model.request.RegisterChannelEvent;
import com.example.demo.service.ChannelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController {

    private final ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @PostMapping("/v1/register-channel")
    public void registerChannel(@RequestBody RegisterChannelEvent request) {
        channelService.registerChannel(request);
    }

    @GetMapping("/v1/channel")
    public ResponseEntity<RegisterChannelEvent> getChannelEvent() {
        return ResponseEntity.ok(channelService.getChannelEvent());
    }
}
