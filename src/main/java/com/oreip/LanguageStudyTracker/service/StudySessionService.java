package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.StudySession;

import java.util.List;

public interface StudySessionService {
    List<StudySession> findSessionsByUserId(int theId);

    List<StudySession> findSessionsByUserIdAndLanguageId(int userId, int languageId);

    StudySession save(StudySessionService theSession);
}
