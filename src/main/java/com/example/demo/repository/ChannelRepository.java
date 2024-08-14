package com.example.demo.repository;

import com.example.demo.model.request.RegisterChannelEvent;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelRepository {

    private RegisterChannelEvent registerChannelEvent;

    public void saveChannelEvent(RegisterChannelEvent registerChannelEvent) {
        this.registerChannelEvent = registerChannelEvent;
    }

    public RegisterChannelEvent getChannelEvent() {
        return registerChannelEvent;
    }
}
