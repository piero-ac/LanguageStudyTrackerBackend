package com.oreip.LanguageStudyTracker.service;

import com.oreip.LanguageStudyTracker.entity.SessionActivity;
import com.oreip.LanguageStudyTracker.entity.SessionActivityId;

import java.util.List;

public interface SessionActivityService {
    List<SessionActivity> findByStudySessionId(int theId);

    SessionActivity save(SessionActivity theActivity);
}
