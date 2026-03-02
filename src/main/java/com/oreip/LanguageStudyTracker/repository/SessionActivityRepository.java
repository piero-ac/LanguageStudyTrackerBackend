package com.oreip.LanguageStudyTracker.repository;

import com.oreip.LanguageStudyTracker.entity.SessionActivity;
import com.oreip.LanguageStudyTracker.entity.SessionActivityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionActivityRepository extends JpaRepository<SessionActivity, SessionActivityId> {
}
