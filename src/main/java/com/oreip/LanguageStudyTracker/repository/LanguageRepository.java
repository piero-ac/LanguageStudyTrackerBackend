package com.oreip.LanguageStudyTracker.repository;

import com.oreip.LanguageStudyTracker.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
