package com.example.demo.model.request;

import com.example.demo.constants.ChannelType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "eventType",
        visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = EmailChannelEvent.class, name = "EMAIL"),
        @JsonSubTypes.Type(value = MessageChannelEvent.class, name = "MESSAGE"),
        @JsonSubTypes.Type(value = PushNotificationChannelEvent.class, name = "PUSH_NOTIFICATION"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RegisterChannelEvent<T> {

    private ChannelType eventType;

    private T eventBody;

    public RegisterChannelEvent() {
    }

    public RegisterChannelEvent(ChannelType eventType, T eventBody) {
        this.eventType = eventType;
        this.eventBody = eventBody;
    }

    public ChannelType getEventType() {
        return eventType;
    }

    public void setEventType(ChannelType eventType) {
        this.eventType = eventType;
    }

    public T getEventBody() {
        return eventBody;
    }

    public void setEventBody(T eventBody) {
        this.eventBody = eventBody;
    }
}
