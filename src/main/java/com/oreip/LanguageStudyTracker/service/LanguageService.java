package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.Language;

import java.util.List;

public interface LanguageService {
    List<Language> findAll();
    Language findById(int id);
}
