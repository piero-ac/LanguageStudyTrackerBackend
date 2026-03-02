package com.oreip.LanguageStudyTracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SessionActivityId implements Serializable {

    @Column(name="session_id")
    private Integer sessionId;

    @Enumerated(EnumType.STRING)
    @Column(name="activity_type")
    private ActivityType activityType;

    public SessionActivityId() {}

    public SessionActivityId(Integer sessionId, ActivityType activityType) {
        this.sessionId = sessionId;
        this.activityType = activityType;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SessionActivityId that)) return false;
        return Objects.equals(sessionId, that.sessionId) &&
                Objects.equals(activityType, that.activityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, activityType);
    }
}
