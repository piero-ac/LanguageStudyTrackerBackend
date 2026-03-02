package com.oreip.LanguageStudyTracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserLanguageId implements Serializable {

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "language_id")
    private Integer languageId;

    public UserLanguageId() {}

    public UserLanguageId(Integer userId, Integer languageId) {
        this.userId = userId;
        this.languageId = languageId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserLanguageId that)) return false;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(languageId, that.languageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, languageId);
    }
}
