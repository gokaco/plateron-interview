package com.example.demo.service;

import com.example.demo.model.request.RegisterChannelEvent;
import com.example.demo.repository.ChannelRepository;
import org.springframework.stereotype.Service;

@Service
public class ChannelService {

    private final ChannelRepository channelRepository;

    public ChannelService(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }



    public void registerChannel(RegisterChannelEvent request) {
        channelRepository.saveChannelEvent(request);
    }

    public RegisterChannelEvent getChannelEvent() {
        return channelRepository.getChannelEvent();
    }

}
