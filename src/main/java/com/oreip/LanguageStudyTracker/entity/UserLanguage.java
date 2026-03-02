package com.oreip.LanguageStudyTracker.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="user_language")
public class UserLanguage {

    @EmbeddedId
    private UserLanguageId id;

    // ON DELETE CASCADE handled at DB level
    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    // ON DELETE CASCADE handled at DB level
    @ManyToOne
    @MapsId("languageId")
    @JoinColumn(name = "language_id")
    private Language language;

    @Column(name = "started_learning_date")
    private LocalDate startedLearningDate;

    public UserLanguage() {}

    public UserLanguage(User user, Language language, LocalDate startedLearningDate) {
        this.id = new UserLanguageId(user.getId(), language.getId());
        this.user = user;
        this.language = language;
        this.startedLearningDate = startedLearningDate;
    }

    public UserLanguageId getId() {
        return id;
    }

    public void setId(UserLanguageId id) {
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

    public LocalDate getStartedLearningDate() {
        return startedLearningDate;
    }

    public void setStartedLearningDate(LocalDate startedLearningDate) {
        this.startedLearningDate = startedLearningDate;
    }

    @Override
    public String toString() {
        return "UserLanguage{" +
                "id=" + id +
                ", startedLearningDate=" + startedLearningDate +
                '}';
    }

}
