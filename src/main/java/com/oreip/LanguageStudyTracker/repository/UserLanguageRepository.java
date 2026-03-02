package com.oreip.LanguageStudyTracker.repository;

import com.oreip.LanguageStudyTracker.entity.UserLanguage;
import com.oreip.LanguageStudyTracker.entity.UserLanguageId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLanguageRepository  extends JpaRepository<UserLanguage, UserLanguageId> {
}
