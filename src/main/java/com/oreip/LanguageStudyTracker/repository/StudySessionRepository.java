package com.oreip.LanguageStudyTracker.repository;

import com.oreip.LanguageStudyTracker.entity.StudySession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudySessionRepository extends JpaRepository<StudySession, Integer> {
}
