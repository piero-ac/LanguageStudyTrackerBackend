package com.oreip.LanguageStudyTracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name="session_activity")
public class SessionActivity {

    @EmbeddedId
    private SessionActivityId id;

    @ManyToOne
    @MapsId("sessionId")
    @JoinColumn(name="session_id")
    private StudySession studySession;

    @Column(name="notes")
    private String notes;

    public SessionActivity() {}

    public SessionActivity(StudySession studySession, ActivityType activityType, String notes) {
        this.id = new SessionActivityId(studySession.getId(), activityType);
        this.studySession = studySession;
        this.notes = notes;
    }

    public SessionActivityId getId() {
        return id;
    }

    public void setId(SessionActivityId id) {
        this.id = id;
    }

    public StudySession getStudySession() {
        return studySession;
    }

    public void setStudySession(StudySession studySession) {
        this.studySession = studySession;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "SessionActivity{" +
                "id=" + id +
                ", studySession=" + studySession +
                ", notes='" + notes + '\'' +
                '}';
    }
}
