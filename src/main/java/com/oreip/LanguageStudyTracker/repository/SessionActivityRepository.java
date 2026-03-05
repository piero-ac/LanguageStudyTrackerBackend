package com.oreip.LanguageStudyTracker.repository;

import com.oreip.LanguageStudyTracker.entity.SessionActivity;
import com.oreip.LanguageStudyTracker.entity.SessionActivityId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionActivityRepository extends JpaRepository<SessionActivity, SessionActivityId> {
    List<SessionActivity> findByStudySessionId(int theId);
}
