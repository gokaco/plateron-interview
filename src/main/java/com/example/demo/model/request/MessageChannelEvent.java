package com.example.demo.model.request;

import com.example.demo.constants.ChannelType;

public class MessageChannelEvent extends RegisterChannelEvent<MessageChannelEvent.Message> {

    public class Message {
        private String phoneNumber;

        public Message() {
        }

        public Message(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

    }

    public MessageChannelEvent() {
    }

    public MessageChannelEvent(ChannelType eventType, Message eventBody) {
        super(eventType, eventBody);
    }
}
