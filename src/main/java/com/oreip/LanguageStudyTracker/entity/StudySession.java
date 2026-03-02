package com.oreip.LanguageStudyTracker.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="study_session")
public class StudySession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @Column(name="start_time")
    private LocalDate startTime;

    @Column(name="end_time")
    private LocalDate endTime;

    @Column(name="notes")
    private String notes;

    public StudySession() {}

    public StudySession(User user, Language language, LocalDate startTime, LocalDate endTime, String notes) {
        this.user = user;
        this.language = language;
        this.startTime = startTime;
        this.endTime = endTime;
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "StudySession{" +
                "id=" + id +
                ", user=" + user +
                ", language=" + language +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", notes='" + notes + '\'' +
                '}';
    }
}
