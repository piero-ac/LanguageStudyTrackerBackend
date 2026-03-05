package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.UserLanguage;

import java.util.List;

public interface UserLanguageService {
    List<UserLanguage> findAllByUserId(int theId);

    UserLanguage save(UserLanguage theUserLanguage);
}
