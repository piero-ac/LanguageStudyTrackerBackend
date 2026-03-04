package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.StudySession;

import java.util.List;

public interface StudySessionService {
    List<StudySession> findByUserId(int theId);

    List<StudySession> findByUserIdAndLanguageId(int userId, int languageId);

    StudySession save(StudySession theSession);
}
