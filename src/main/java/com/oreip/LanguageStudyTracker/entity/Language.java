package com.oreip.LanguageStudyTracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name="language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="language")
    private String language;

    @Column(name="abbreviation")
    private String abbreviation;

    public Language() {}

    public Language(String language, String abbreviation) {
        this.language = language;
        this.abbreviation = abbreviation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
