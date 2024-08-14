package com.example.demo.model.request;

public class EmailChannelEvent extends RegisterChannelEvent<EmailChannelEvent.Message> {

    public class Message {
        private String emailId;

        public Message() {
        }

        public Message(String emailId) {
            this.emailId = emailId;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }
}
