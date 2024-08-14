package com.example.demo.model.request;

public class PushNotificationChannelEvent extends RegisterChannelEvent<PushNotificationChannelEvent.Message> {

    public class Message {

        private String deviceId;

        public Message() {
        }

        public Message(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

    }
}
